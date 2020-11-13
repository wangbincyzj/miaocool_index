package net.miaocool.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("index_config")
public class IndexConfig {

  @TableId(type = IdType.AUTO)
  private long id;
  private String tag;
  private String name;
  private String value;
  private String desc;
  private Date updateTime;
  private String meta;

}
