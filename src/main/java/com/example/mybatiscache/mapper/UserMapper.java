package com.example.mybatiscache.mapper;

import com.example.mybatiscache.cache.MybatisRedisCache;
import com.example.mybatiscache.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.CacheNamespace;

/**
 * <p>
 * 用户信息 Mapper 接口
 * </p>
 *
 * @author 陈永鹏
 * @since 2021-10-20
 */
@CacheNamespace(implementation= MybatisRedisCache.class,eviction=MybatisRedisCache.class)
public interface UserMapper extends BaseMapper<User> {

}
