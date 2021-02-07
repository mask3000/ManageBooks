package mask3000.booksmanagement.dao;

import mask3000.booksmanagement.pojo.MailDetail;

import java.util.List;

public interface MailMapper {
    // 还书提醒
    List<MailDetail> returnReminder();

    List<MailDetail> resReminder();
}
