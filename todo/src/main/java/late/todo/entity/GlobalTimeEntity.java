/**
 * @description
 */
package late.todo.entity;

import javax.persistence.Entity;

import late.comm.entity.MaintainEntity;
import late.comm.eum.RecordStatus;
import late.todo.eum.GlobalTimeType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 休息时间
 * 
 * @projectName todo
 * @packageName late.todo.entity
 * @fileName HaltTimeEntity.java
 * @author chijingjia
 * @createTime :2018年10月8日 下午9:35:56
 * @version: v1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class GlobalTimeEntity extends MaintainEntity {
	/**
	 * 代称
	 */
	private String name;
	/**
	 * 状态
	 */
	private RecordStatus status;
	/**
	 * 时间类型
	 */
	private GlobalTimeType type;
	/**
	 * 开始日期
	 */
	private String startDate;
	/**
	 * 结束日期
	 */
	private String endDate;
	/**
	 * 开始时间
	 */
	private String startTime;
	/**
	 * 结束时间
	 */
	private String endTime;
}
