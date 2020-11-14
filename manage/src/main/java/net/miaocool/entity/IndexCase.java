package net.miaocool.entity;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.IdType;

@Data
@TableName("index_case")
public class IndexCase {

  @TableId(type = IdType.AUTO)
  private Long id;

  private String title;

  private String subTitle;

  private String image;

  private String content;

  private String button;

  private String sort;

  private Long disable;

}
