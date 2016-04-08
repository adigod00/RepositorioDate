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
		if((day<1) || (day>31)){
			excepciones.append("ERROR. El día tiene que ser mayor que 0 y menor que 32.Valor no válido para día:" + day + "\n");
		}
		if((month<1) || (month>12)){
			excepciones.append("ERROR. El mes debe ser menor 12 y mayor que 0.Valor no válido para mes:" + month + "\n");
		}else{
			if(this.checkDay(day,month)==false){
				excepciones.append("ERROR. Combinación día/mes no válida:" + day + "/" + month + "\n");
			}
		}
		if(year<0){
			excepciones.append("ERROR. El año debe ser positivo.Valor no válido para año:" + year + "\n");
		}
		if(excepciones.length()!=0){
			throw new DateException(excepciones.toString());
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

	public int getMonth(){
		return this.month;
	}

	public String getMonthName(){
		String monthName="";
		switch(month){
			case 1:
				monthName="Enero";
			break;
			case 2:
				monthName="Febrero";
			break;
			case 3:
				monthName="Marzo";
			break;
			case 4:
				monthName="Abril";
			break;
			case 5:
				monthName="Mayo";
			break;
			case 6:
				monthName="Junio";
			break;
			case 7:
				monthName="Julio";
			break;
			case 8:
				monthName="Agosto";
			break;
			case 9:
				monthName="Septiembre";
			break;
			case 10:
				monthName="Octubre";
			break;
			case 11:
				monthName="Noviembre";
			break;
			case 12:
				monthName="Diciembre";
			break;
		}
	return monthName;
	}
	
	public String getSeasonName(){
		String season="";
		switch(month){
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
		}
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
		if((isSameDay==true) && (isSameMonth==true) && (isSameYear==true)){
			return true;
		}else{
			return false;
		}
	}
	
	private int getDaysOfMonth(int month){
		int days;
			switch(month){
				case 4:
				case 6:
				case 9:
				case 11:
					days=30;
				break;
				case 2:
					days=28;
				break;
				default:
					days=31;
			}
		return days;
	}

	private boolean checkDay(int day, int month){
		boolean retorno;
			if(day>this.getDaysOfMonth(month)){
				retorno=false;
			}else{
				retorno=true;
			}
		return retorno;
	}
	
	public String sameDaysOfMonth(){
		int i;
		String mes="";
		StringBuffer sameDaysOfMonth = new StringBuffer(); 
		sameDaysOfMonth.append("Meses con los mismos días: ");
		if(this.month==2){
			mes="Febrero";
			sameDaysOfMonth.append(mes);
		}else{
			for(i=1;i<13;i++){
				if((getDaysOfMonth(this.getMonth()))==getDaysOfMonth(i)){		
					if(this.month==i){
						mes=mes;
					}else{
						switch(i){
							case 1:
								mes="Enero";
							break;
							case 2:
								mes="Febrero";
							break;
							case 3:
								mes="Marzo";
							break;
							case 4:
								mes="Abril";
							break;
							case 5:
								mes="Mayo";
							break;
							case 6:
								mes="Junio";
							break;
							case 7:
								mes="Julio";
							break;
							case 8:
								mes="Agosto";
							break;
							case 9:
								mes="Septiembre";
							break;
							case 10:
								mes="Octubre";
							break;
							case 11:
								mes="Noviembre";
							break;
							case 12:
								mes="Diciembre";
							break;
						}
						sameDaysOfMonth.append( mes + " ");
					}
				}
			}
		}
		return sameDaysOfMonth.toString();
	}
	
	public String leftDays(){
		StringBuffer diasRestantes= new StringBuffer();
		diasRestantes.append("Días restantes hasta el final del mes: ");
		int i;
			for(i=this.day+1;i<(this.getDaysOfMonth(month))+1;i++){
				diasRestantes.append(i+" ");
			}
		return diasRestantes.toString();
	}
	
	public String leftMonths(){
		StringBuffer mesesRestantes = new StringBuffer();
		mesesRestantes.append("Meses que quedan hasta final de año: ");
		int x;
		String mes="";
		if(this.month==12){
			mesesRestantes.append("Este es el último mes del año");
		}else{
			for(x=this.month+1;x<13;x++){
				switch(x){
					case 1:
						mes="Enero";
					break;
					case 2:
						mes="Febrero";
					break;
					case 3:
						mes="Marzo";
					break;
					case 4:
						mes="Abril";
					break;
					case 5:
						mes="Mayo";
					break;
					case 6:
						mes="Junio";
					break;
					case 7:
						mes="Julio";
					break;
					case 8:
						mes="Agosto";
					break;
					case 9:
						mes="Septiembre";
					break;
					case 10:
						mes="Octubre";
					break;
					case 11:
						mes="Noviembre";
					break;
					case 12:
						mes="Diciembre";
					break;
				}
				mesesRestantes.append(mes + " ");
			}
		}
		return mesesRestantes.toString();
	}

	public String toString(){
		StringBuffer salida=new StringBuffer();
		salida.append("Fecha: ");
		salida.append(this.day+"/");
		salida.append(this.month+"/");
		salida.append(this.year+"\n");
		salida.append(this.getSeasonName()+"\n");
		salida.append(this.sameDaysOfMonth()+"\n");
		salida.append(this.leftMonths()+"\n");
		salida.append(this.leftDays()+"\n");
		return salida.toString();
	}
}
