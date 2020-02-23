package com.accp;

import com.accp.service.MailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@SpringBootTest
class CarApplicationTests {

    @Test
    void contextLoads() {

    }
    @Autowired
    private MailService mailService;

    private String to = "2395398850@qq.com";

   /* @Test
    public void sendSimpleMail() {
        mailService.sendSimpleMail(to, "主题：简单邮件", "测试邮件内容");
    }*/
/*    @Test*/
    public void sendHtmlMail(){
        String html = "<head>\n" +
                "    <base target=\"_blank\" />\n" +
                "    <style type=\"text/css\">::-webkit-scrollbar{ display: none; }</style>\n" +
                "    <style id=\"cloudAttachStyle\" type=\"text/css\">#divNeteaseBigAttach, #divNeteaseBigAttach_bak{display:none;}</style>\n" +
                "    <style id=\"blockquoteStyle\" type=\"text/css\">blockquote{display:none;}</style>\n" +
                "    <style type=\"text/css\">\n" +
                "        body{font-size:14px;font-family:arial,verdana,sans-serif;line-height:1.666;padding:0;margin:0;overflow:auto;white-space:normal;word-wrap:break-word;min-height:100px}\n" +
                "        td, input, button, select, body{font-family:Helvetica, 'Microsoft Yahei', verdana}\n" +
                "        pre {white-space:pre-wrap;white-space:-moz-pre-wrap;white-space:-pre-wrap;white-space:-o-pre-wrap;word-wrap:break-word;width:95%}\n" +
                "        th,td{font-family:arial,verdana,sans-serif;line-height:1.666}\n" +
                "        img{ border:0}\n" +
                "        header,footer,section,aside,article,nav,hgroup,figure,figcaption{display:block}\n" +
                "        blockquote{margin-right:0px}\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body tabindex=\"0\" role=\"listitem\">\n" +
                "<table width=\"700\" border=\"0\" align=\"center\" cellspacing=\"0\" style=\"width:700px;\">\n" +
                "    <tbody>\n" +
                "    <tr>\n" +
                "        <td>\n" +
                "            <div style=\"width:700px;margin:0 auto;border-bottom:1px solid #ccc;margin-bottom:30px;\">\n" +
                "                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"700\" height=\"39\" style=\"font:12px Tahoma, Arial, 宋体;\">\n" +
                "                    <tbody><tr><td width=\"210\"></td></tr></tbody>\n" +
                "                </table>\n" +
                "            </div>\n" +
                "            <div style=\"width:680px;padding:0 10px;margin:0 auto;\">\n" +
                "                <div style=\"line-height:1.5;font-size:14px;margin-bottom:25px;color:#4d4d4d;\">\n" +
                "                    <strong style=\"display:block;margin-bottom:15px;\">尊敬的用户：<span style=\"color:#f60;font-size: 16px;\"></span>您好！</strong>\n" +
                "                    <strong style=\"display:block;margin-bottom:15px;\">\n" +
                "                        您正在进行<span style=\"color: red\">注销账号</span>操作，请在验证码输入框中输入：<span style=\"color:#f60;font-size: 24px\">182614</span>，以完成操作。\n" +
                "                    </strong>\n" +
                "                </div>\n" +
                "                <div style=\"margin-bottom:30px;\">\n" +
                "                    <small style=\"display:block;margin-bottom:20px;font-size:12px;\">\n" +
                "                        <p style=\"color:#747474;\">\n" +
                "                            注意：此操作可能会修改您的密码、登录邮箱或绑定手机。如非本人操作，请及时登录并修改密码以保证帐户安全\n" +
                "                            <br>（工作人员不会向你索取此验证码，请勿泄漏！)\n" +
                "                        </p>\n" +
                "                    </small>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div style=\"width:700px;margin:0 auto;\">\n" +
                "                <div style=\"padding:10px 10px 0;border-top:1px solid #ccc;color:#747474;margin-bottom:20px;line-height:1.3em;font-size:12px;\">\n" +
                "                    <p>此为系统邮件，请勿回复<br>\n" +
                "                        请保管好您的邮箱，避免账号被他人盗用\n" +
                "                    </p>\n" +
                "                    <p>院主网络科技团队</p>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </td>\n" +
                "    </tr>\n" +
                "    </tbody>\n" +
                "</table>\n" +
                "</body>";
        mailService.sendHtmlMail(to,"卡修找回密码",html);
    }

    /**
     * 获取过去第几天的日期
     *
     * @param past
     * @return
     */
    public static String getPastDate(int past) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - past);
        Date today = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String result = format.format(today);
        return result;
    }
    @Test
    public void test(){
        System.out.println(getPastDate(1));
    }
}
