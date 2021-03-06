package im.onclick.open.ins.car.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.blue.validation.group.SaveModel;

public class Coverage {
	@NotBlank(groups = { SaveModel.class }, message = "车险险种编号不能为空")
	@Size(min = 0, max = 3, groups = { SaveModel.class}, message = "车险险种编号长度[0-3]")
	private String code;           //车险险种编号
	@NotNull(groups = { SaveModel.class }, message = "不计免赔标识不能为空")
	private Integer compensation;   //是否不计免赔，参考6.7是否不计免赔
	@NotNull(groups = { SaveModel.class }, message = "总保额不能为空")
	private Double amount;         //总保额
	private Double unitAmount;     //单位保额，司机险或乘客险必填
	private Integer quantity;       //坐位数，司机险或乘客险必填
	private Integer glassType;      //玻璃类型，参考6.10玻璃类型，玻璃险必填

	private String name;
	private Double basicPremium;
	private Double discount;
	private Double standardPremium;
	public Coverage() {

	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getCompensation() {
		return compensation;
	}

	public void setCompensation(Integer compensation) {
		this.compensation = compensation;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getUnitAmount() {
		return unitAmount;
	}

	public void setUnitAmount(Double unitAmount) {
		this.unitAmount = unitAmount;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getGlassType() {
		return glassType;
	}

	public void setGlassType(Integer glassType) {
		this.glassType = glassType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBasicPremium() {
		return basicPremium;
	}

	public void setBasicPremium(Double basicPremium) {
		this.basicPremium = basicPremium;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getStandardPremium() {
		return standardPremium;
	}

	public void setStandardPremium(Double standardPremium) {
		this.standardPremium = standardPremium;
	}
	
}
