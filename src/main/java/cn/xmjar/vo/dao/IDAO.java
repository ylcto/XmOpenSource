package cn.xmjar.vo.dao;

import org.apache.ibatis.annotations.Insert;

import java.util.List;

/**
 * <li>定义公共接口方法，常用的CRUD方法在此定义</li>
 * @param <K> 表示对象主键类型
 * @param <V> 表示对象信息
 */
public interface IDAO<K, V> {

    public boolean doCreate(V vo);

    public boolean doUpdate(V vo);

    public boolean doRemove(K id);

    public List<V> findAll();

    public List<V> findAllBySplit(String keyWord, String column, Integer currentPage, Integer lineSize);

    public Integer getAllCount(String keyWord, String column);
}
