package entities;

public class PessoaJuridica extends Pessoa{

	private Integer employees;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String name, Double income, Integer employees) {
		super(name, income);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public double taxa() {
		if(employees<=10) {
			return super.getIncome()*0.16;
		}
		else {
			return super.getIncome()*0.14;
		}
	}

}
