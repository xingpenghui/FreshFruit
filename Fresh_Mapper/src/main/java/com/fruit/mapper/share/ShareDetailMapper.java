package com.fruit.mapper.share;

import com.fruit.domain.share.ShareDetail;

public interface ShareDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShareDetail record);

    int insertSelective(ShareDetail record);

    ShareDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShareDetail record);

    int updateByPrimaryKeyWithBLOBs(ShareDetail record);

    int updateByPrimaryKey(ShareDetail record);
}