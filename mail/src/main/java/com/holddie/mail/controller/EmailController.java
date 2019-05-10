package com.holddie.mail.controller;


import com.holddie.mail.domain.JsonResult;
import com.holddie.mail.service.impl.IMailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 邮件API
 *
 * @author HoldDie
 * @version 1.0
 */
@RestController
@RequestMapping("api/email")
public class EmailController {

    @Autowired
    private IMailServiceImpl mailService;

    @RequestMapping
    public JsonResult index() {
        try {
            mailService.sendSimpleMail("holddie@foxmail.com", "这是一封普通的邮件", "这是一封普通的SpringBoot测试邮件");
        } catch (Exception ex) {
            ex.printStackTrace();
            return new JsonResult(-1, "邮件发送失败!!");
        }
        return new JsonResult();
    }

    @RequestMapping("/htmlEmail")
    public JsonResult htmlEmail() {
        try {
            mailService.sendHtmlMail("holddie@foxmail.com", "这是一HTML的邮件", "<body style=\"text-align: center;margin-left: auto;margin-right: auto;\">\n"
                    + "	<div id=\"welcome\" style=\"text-align: center;position: absolute;\" >\n"
                    + "		<h3>欢迎使用IJPay -By Javen</h3>\n"
                    + "		<span>https://github.com/Javen205/IJPay</span>"
                    + "		<div\n"
                    + "			style=\"text-align: center; padding: 10px\"><a style=\"text-decoration: none;\" href=\"https://github.com/Javen205/IJPay\" target=\"_bank\" ><strong>IJPay 让支付触手可及,欢迎Start支持项目发展:)</strong></a></div>\n"
                    + "		<div\n" + "			style=\"text-align: center; padding: 4px\">如果对你有帮助,请任意打赏</div>\n"
                    + "		<img width=\"180px\" height=\"180px\"\n"
                    + "			src=\"https://oscimg.oschina.net/oscnet/8e86fed2ee9571eb133096d5dc1b3cb2fc1.jpg\">\n"
                    + "	</div>\n" + "</body>");
        } catch (Exception ex) {
            ex.printStackTrace();
            return new JsonResult(-1, "邮件发送失败!!");
        }
        return new JsonResult();
    }

    @RequestMapping("/attachmentsMail")
    public JsonResult attachmentsMail() {
        try {
            String filePath = "/Users/holddie/Desktop/1.png";
            mailService.sendAttachmentsMail("holddie@foxmail.com", "这是一封带附件的邮件", "邮件中有附件，请注意查收！", filePath);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new JsonResult(-1, "邮件发送失败!!");
        }
        return new JsonResult();
    }

    @RequestMapping("/resourceMail")
    public JsonResult resourceMail() {
        try {
            String rscId = "IJPay";
            String content = "<html><body>这是有图片的邮件<br/><img src=\'cid:" + rscId + "\' ></body></html>";
            String imgPath = "/Users/holddie/Desktop/1.png";
            mailService.sendResourceMail("holddie@foxmail.com", "这邮件中含有图片", content, imgPath, rscId);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new JsonResult(-1, "邮件发送失败!!");
        }
        return new JsonResult();
    }

    @RequestMapping("/templateMail")
    public JsonResult templateMail() {
        try {
            mailService.sendTemplateMail("holddie@foxmail.com", "这是一封模板邮件", "message.ftl");
        } catch (Exception ex) {
            ex.printStackTrace();
            return new JsonResult(-1, "邮件发送失败!!");
        }
        return new JsonResult();
    }

}
