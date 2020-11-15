package net.miaocool.entity;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.IdType;

@Data
@TableName("index_type")
public class IndexType {

  @TableId(type = IdType.AUTO)
  private Long id;

  private Long sort;

  private String title;

  private String subtitle;

  private String iconClass;

  private String iconUrl;

  private Long disable;

}
