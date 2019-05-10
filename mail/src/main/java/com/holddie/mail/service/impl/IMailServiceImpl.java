package com.holddie.mail.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.holddie.mail.service.IMailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Slf4j
@Component
public class IMailServiceImpl implements IMailService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.from}")
    private String from;

    /**
     * 发送文本邮件
     *
     * @param to
     * @param subject
     * @param content
     */
    @Override
    public void sendSimpleMail(String to, String subject, String content) {
        sendSimpleMail(to, subject, content, (String[]) null);
    }

    @Override
    public void sendSimpleMail(String to, String subject, String content, String... cc) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        if (Objects.nonNull(cc)) {
            message.setCc(cc);
        }
        message.setSubject(subject);
        message.setText(content);
        mailSender.send(message);
    }

    /**
     * 发送HTML邮件
     *
     * @param to
     * @param subject
     * @param content
     */
    @Override
    public void sendHtmlMail(String to, String subject, String content) throws MessagingException {
        sendHtmlMail(to, subject, content, (String[]) null);
    }

    @Override
    public void sendHtmlMail(String to, String subject, String content, String... cc) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        generateMailHelper(to, subject, content, message, cc);
        mailSender.send(message);
    }


    /**
     * 发送带附件的邮件
     *
     * @param to
     * @param subject
     * @param content
     * @param filePath
     */
    @Override
    public void sendAttachmentsMail(String to, String subject, String content, String filePath) throws MessagingException {
        sendAttachmentsMail(to, subject, content, filePath, (String[]) null);
    }

    @Override
    public void sendAttachmentsMail(String to, String subject, String content, String filePath, String... cc) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = generateMailHelper(to, subject, content, message, cc);
        FileSystemResource file = new FileSystemResource(new File(filePath));
        String fileName = filePath.substring(filePath.lastIndexOf(File.separator));
        helper.addAttachment(fileName, file);
        mailSender.send(message);
    }


    /**
     * 发送正文中有静态资源（图片）的邮件
     *
     * @param to
     * @param subject
     * @param content
     * @param rscPath
     * @param rscId
     */
    @Override
    public void sendResourceMail(String to, String subject, String content, String rscPath, String rscId) throws MessagingException {
        sendResourceMail(to, subject, content, rscPath, rscId, (String[]) null);
    }

    @Override
    public void sendResourceMail(String to, String subject, String content, String rscPath, String rscId, String... cc) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = generateMailHelper(to, subject, content, message, cc);

        FileSystemResource res = new FileSystemResource(new File(rscPath));
        helper.addInline(rscId, res);

        mailSender.send(message);
    }

    private MimeMessageHelper generateMailHelper(String to, String subject, String content, MimeMessage message, String[] cc) throws MessagingException {
        //true表示需要创建一个multipart message
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom(from);
        helper.setTo(to);
        if (Objects.nonNull(cc)) {
            helper.setCc(cc);
        }
        helper.setSubject(subject);
        helper.setText(content, true);
        return helper;
    }

    @Override
    public void sendTemplateMail(String to, String subject, String templateName) throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom(from);
        helper.setTo(to);
        helper.setSubject(subject);

        Map<String, Object> model = new HashMap<>();
        model.put("params", new JSONObject(){{
            put("messageCode","code");
            put("messageStatus","status");
            put("cause","cause");
        }});
//        try {
//            Template template = configurer.getConfiguration().getTemplate(templateName);
//            String text = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
//            helper.setText(text, true);
//            mailSender.send(mimeMessage);
//        } catch (IOException | TemplateException e) {
//            e.printStackTrace();
//        }
    }
}
