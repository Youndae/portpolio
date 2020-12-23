package com.portpolio.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.portpolio.domain.PortpolioVO;

import java.util.List;

@Mapper
public interface PortpolioMapper {

    List<PortpolioVO> PortpolioList() throws Exception;

    public PortpolioVO PortpolioDetail(String ptName) throws Exception;
}
