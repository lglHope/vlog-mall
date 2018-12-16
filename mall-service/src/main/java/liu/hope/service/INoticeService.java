package liu.hope.service;

import liu.hope.entity.Notice;

public interface INoticeService {

    /**
     * 通过ID查找对象
     * @param id 主键
     * @return 对象
     */
    Notice selectById(Integer id);

    /**
     * 保存对象
     * @param notice 对象数据
     */
    Notice insert(Notice notice);
}
