package mask3000.booksmanagement.controller;

import mask3000.booksmanagement.pojo.ProcessResult;
import mask3000.booksmanagement.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/managebooks")
public class EmailController {
    @Autowired
    MailService mailService;

    @RequestMapping(value = "/{validation}/email", method = RequestMethod.GET)
    public ProcessResult remindReturn(@PathVariable(value = "validation")String val){
        ProcessResult pr=null;
        if(val==null)return new ProcessResult(false);
        if(!val.equals("czctalent")&&!val.equals("czhtalent"))return new ProcessResult(false);
        if(val.equals("czctalent")) {
            // 提醒还书
            mailService.processReturnReminder();
        }else {
            // 提醒预约
            mailService.processResReminder();
        }
        pr = new ProcessResult(true);
        return pr;
    }



}
