package net.miaocool.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class BaseModel {
  @TableField(exist = false)
  private int currentPage;

  @TableField(exist = false)
  private int pageSize = 10;
}
