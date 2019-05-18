package com.holddie.framework.bean;

import com.holddie.framework.error.BadRequestAlertException;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.validation.BindingResult;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * 控制器基类
 * @author HoldDie
 * @version v1.0.0
 * @email HoldDie@163.com
 * @date 2018/8/12 15:23
 */
@Slf4j
public abstract class BaseController {

    /**
     * 公共导出方法
     * @param response 返回值
     * @param fileName 文件名称
     * @param workbook workbook
     * @author HoldDie
     * @email HoldDie@163.com
     * @date 2018/8/28 18:22
     */
    protected void commonExport(HttpServletResponse response, String fileName, Workbook workbook) throws IOException {
        response.setHeader("content-Type", "application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8") + ".xls");
        response.setCharacterEncoding("UTF-8");
        workbook.write(response.getOutputStream());
        workbook.close();
    }

    private void validateParams(BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            String errorMessage = bindingResult.getAllErrors().get(0).getDefaultMessage();
            throw new BadRequestAlertException(errorMessage);
        }
    }


}
