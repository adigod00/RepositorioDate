package es.unileon.prg1.date;

public class Date{
	private int day;
	private int month;
	private int year;

	public Date(){
		this.day=1;
		this.month=1;
		this.year=2016;
	}
	
	public Date(Date aux){
		this.day=aux.getDay();
		this.month=aux.getMonth();
		this.year=aux.getYear();
	}

	public Date(int day, int month, int year) throws DateException{

		StringBuffer excepciones=new StringBuffer("");
		excepciones.length()=false;
		if((this.day<1) || (this.day>31)){
			excepciones.append("ERROR. El día tiene que ser mayor que 0 y menor que 32.\n");
		}
		if((this.month<1) || (this.month>12)){
			excepciones.append("ERROR. El mes debe ser menor 12 y mayor que 0.\n");
		}
		if(this.year<1){
			excepciones.append("ERROR. El año debe ser mayor que 0.\n");
		}
		if(retorno.checkDay()==false){
			excepciones.append("ERROR. Día no valido para ese mes.\n");
		}
		if(excepciones.length()!=0){
			throw new DateException(excepciones);
		}else{
			this.day=day;
			this.month=month;
			this.year=year;
		}

	}

	public void setDay(int day){
		this.day=day;
	}
	public int getDay(){
		return this.day;
	}
	
	public void setYear(int year){
		this.year=year;
	}
	
	public int getYear(){
		return this.year;
	}

	public void setMonth(int month){
		this.month=month;
	}

	public String getMonthName(){
		String month="";
		switch(this.month){
			case 1:
				month="Enero";
			break;
			case 2:
				month="Febrero";
			break;
			case 3:
				month="Marzo";
			break;
			case 4:
				month="Abril";
			break;
			case 5:
				month="Mayo";
			break;
			case 6:
				month="Junio";
			break;
			case 7:
				month="Julio";
			break;
			case 8:
				month="Agosto";
			break;
			case 9:
				month="Septiembre";
			break;
			case 10:
				month="Octubre";
			break;
			case 11:
				month="Noviembre";
			break;
			case 12:
				month="Diciembre";
			break;
	return month;
	}
	
	public String getSeasonName(){
		String season="";
		switch(this.month){
			case 1:
			case 2:
			case 3:
				season="Invierno";
			break;
			case 4:
			case 5:
			case 6:
				season="Primavera";
			break;
			case 7:
			case 8:
			case 9:
				season="Verano";
			break;
			case 10:
			case 11:
			case 12:
				season="Otoño";
			break;
	return season;
	}

	public boolean isSameDay(Date another){
		if(this.day==another.getDay()){
			return true;
		}else{
			return false;
		}
	}

	public boolean isSameMonth(Date another){
		if(this.month==another.getMonth()){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isSameYear(Date another){
		if(this.year==another.getYear()){
			return true;
		}else{
			return false;
		}
	}
	public boolean isSame(boolean isSameDay, boolean isSameMonth, boolean isSameYear){
		if((isSameDay==true) && (isSamenMonth==true) && (isSameYear==true)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean checkDay(int day, int month){
		boolean retorno=true;
			switch(this.month){
				case 4:
				case 6:
				case 9:
				case 11:
					if(this.day>30){
						retorno=false;
					}
				break;
				case 2:
					if(this.day>28){
						retorno=false;
					}
				break;
				default:
					retorno=true;
			}
		return retorno;
	}

	public String leftDays(int day,int month){
		StringBuffer diasRestantes= new StringBuffer();
		int i;
		switch(this.month){
				case 4:
				case 6:
				case 9:
				case 11:
					for(i=this.day+1;i<31;i++){
						diasRestantes.append(i+", ");
					}
				break;
				case 2:
					for(i=this.day+1;i<29;i++){
						diasRestantes.append(i+", ");
					}
				break;
				default:
					for(i=this.day+1;i<32;i++){
						diasRestantes.append(i+", ");
					}
		}
		return diasRestantes;
	}
	
	public String leftMonths(int month){
		StringBuffer mesesRestantes= new StringBuffer();
		int x;
		for(x=this.month+1;x<13;x++){
			mesesRestantes.append.getMonthName;
		}
		return mesesRestantes;
	}

	public String toString(){
		StringBuffer salida=new StringBuffer();
		salida.append("Fecha: "+" ");
		salida.append(+this.day+"/");
		salida.append(+this.month+"/");
		salida.append(+this.year+"\n");
		salida.append(aux.getMonthName()+"\n");
		salida.append(aux.getSeason()+"\n");
		salida.append(aux.leftMonths()+"\n");
		salida.append(aux.leftDays()+"\n");
		return salida.toString();
	}
}
