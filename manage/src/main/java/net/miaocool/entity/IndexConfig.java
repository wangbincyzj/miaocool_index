package net.miaocool.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
@TableName("index_config")
public class IndexConfig {

  @TableId(type = IdType.AUTO)
  private Long id;
  private String tag;
  private String name;
  private String value;
  @TableField("`describe`")
  private String describe;

  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date updateTime;
  private String meta;

}
