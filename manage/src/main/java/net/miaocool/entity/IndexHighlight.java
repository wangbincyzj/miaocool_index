package net.miaocool.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@TableName("index_highlight")
public class IndexHighlight{

  @TableId(type = IdType.AUTO)
  private Long id;
  private String title;
  private String content;
  private String iconClass;
  private String iconUrl;
  private Integer sort;

  private Long disable;

}
