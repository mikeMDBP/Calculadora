package calculadora.logica;

public class Logica {
int numero1, numero2;
int a=10,b=11,c=12,d=13,e=14,f=15;
int  resultado;
public void setnumero1(int numero1){
	this.numero1= numero1;
}

public void setnumero2(int numero2){
	this.numero2= numero2;
}

public int getresultado(){
	
	return this.resultado;
}

public void sumar(){
	resultado = numero1 + numero2;
}

public void restar(){
	resultado = numero1 - numero2;
}

public void multiplicar(){
	resultado = numero1 * numero2;
}

public void Division(){
	resultado = numero1 / numero2;
}

public void porcentaje(){
	resultado = numero1*numero2/100;
}

public void raiz(){
	
	resultado = 1/2*numero2;
	
}

}













