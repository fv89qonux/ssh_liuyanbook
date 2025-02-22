package com.licyun.dao;

import java.util.List;

/**
 * Created by admin
 * Description:
 * 2020/9/26.
 */

public interface BaseDao<T>{
    public void save(T entity);
    public T get(Class<?> clazz, Integer id);
    public void update(T entity);
    public void delete(T entity);
    public void saveOrUpdate(T entity);
    public List<T> find(String queryName,String[] paramNames , Object[] values);
    public List<T> findByPage(final String hql,final int pageNo, final int pageSize);
    public List<T> findByPage(final String hql,final int pageNo, final int pageSize,String[] params ,String[] values);

}
