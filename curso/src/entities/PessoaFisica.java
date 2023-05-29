package entities;

public class PessoaFisica extends Pessoa{
	
	private Double health;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, Double income, Double health) {
		super(name, income);
		this.health = health;
	}

	public Double getHealth() {
		return health;
	}

	public void setHealth(Double health) {
		this.health = health;
	}

	@Override
	public double taxa() {
		if(super.getIncome()<20000.00) {
			return super.getIncome()*0.15-health*0.5;
		}
		else {
			return super.getIncome()*0.25-health*0.5;
		}
	}

	
}
