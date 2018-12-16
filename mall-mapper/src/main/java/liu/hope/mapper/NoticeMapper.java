package liu.hope.mapper;

import liu.hope.entity.Notice;

/**
 * @author Hope
 * @version 1.0
 * TODO:
 * @createTime 2018/12/15 20:33
 */
public interface NoticeMapper {

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
    void insert(Notice notice);

}
