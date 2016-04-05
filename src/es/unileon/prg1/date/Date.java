package es.unileon.prg1.date;

public class Date{
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
		StringBuffer excepciones=new StringBuffer("");
		if((this.day<=0) || (this.month<=0) || (this.year<=0)){
			excepciones.append("ERROR. El año, el mes y el día deben ser mayores que 0.");
		}
		if(this.month>12){
			excepciones.append("ERROR. El mes debe ser menor 12 y mayor que 0.");
		}
		if(this.day>31){
			excepciones.append("ERROR. El día debe ser menor que 32 y mayor que 0.");
		}
		if((this.month==4) || (this.month==6) || (this.month==9) || (this.month==11)) && (this.day>30)){
			excepciones.append("ERROR. El mes introducido tiene 30 dias.");
		}
		if((this.month==2) && (this.day>28)){
			excepciones.append("ERROR. El mes introducido tiene 28 dias.");
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
	
	public String leftMonths(int month){
		String mesesRestantes="";
		int x;
		for(x=this.month;x<=12;x++){
			mesesRestantes.append.getMonthName;
		}
	return mesesRestantes;
	}

	public String toString(){
		StringBuffer salida=new StringBuffer();
		salida.append("Fecha: "+" ");
		salida.append("Día:"+this.day+" ");
		salida.append("Mes:"+this.month+" ");
		salida.append("Año:"+this.year+" ");
		return salida.toString();
	}
}
