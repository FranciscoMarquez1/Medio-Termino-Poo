public class Persona {
	private String nombre,
				   				rfc,
				   				nivelEducativo;

	private double sueldoMensual,
				   aguinaldo,
				   primaVacacional,
				   medicos,
				   funerarios,
				   sggm,
				   hipotecarios,
				   donativos,
				   aportacionRetiro,
				   transporte,
				   colegiatura;


	public Persona(String nombre, String rfc, String nivelEducativo, double sueldoMensual, double aguinaldo, double primaVacacional, double medicos, double funerarios, double sggm, double hipotecarios, double donativos, double aportacionRetiro, double transporte, double colegiatura){
		this.nombre = nombre;
		this.rfc = rfc;
		this.nivelEducativo = nivelEducativo;
		this.sueldoMensual = sueldoMensual;
		this.aguinaldo = aguinaldo;
		this.primaVacacional = primaVacacional;
		this.medicos = medicos;
		this.funerarios = funerarios;
		this.sggm = sggm;
		this.hipotecarios = hipotecarios;
		this.donativos = donativos;
		this.aportacionRetiro = aportacionRetiro;
		this.transporte = transporte;
		this.colegiatura = colegiatura;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getNivelEducativo() {
		return nivelEducativo;
	}

	public void setNivelEducativo(String nivelEducativo) {
		this.nivelEducativo = nivelEducativo;
	}

	public double getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}

	public double getAguinaldo() {
		return aguinaldo;
	}

	public void setAguinaldo(double aguinaldo) {
		this.aguinaldo = aguinaldo;
	}

	public double getPrimaVacacional() {
		return primaVacacional;
	}

	public void setPrimaVacacional(double primaVacacional) {
		this.primaVacacional = primaVacacional;
	}

	public double getMedicos() {
		return medicos;
	}

	public void setMedicos(double medicos) {
		this.medicos = medicos;
	}

	public double getFunerarios() {
		return funerarios;
	}

	public void setFunerarios(double funerarios) {
		this.funerarios = funerarios;
	}

	public double getSggm() {
		return sggm;
	}

	public void setSggm(double sggm) {
		this.sggm = sggm;
	}

	public double getHipotecarios() {
		return hipotecarios;
	}

	public void setHipotecarios(double hipotecarios) {
		this.hipotecarios = hipotecarios;
	}

	public double getDonativos() {
		return donativos;
	}

	public void setDonativos(double donativos) {
		this.donativos = donativos;
	}

	public double getAportacionRetiro() {
		return aportacionRetiro;
	}

	public void setAportacionRetiro(double aportacionRetiro) {
		this.aportacionRetiro = aportacionRetiro;
	}

	public double getTransporte() {
		return transporte;
	}

	public void setTransporte(double transporte) {
		this.transporte = transporte;
	}

	public double getColegiatura() {
		return colegiatura;
	}

	public void setColegiatura(double colegiatura) {
		this.colegiatura = colegiatura;
	}

}
