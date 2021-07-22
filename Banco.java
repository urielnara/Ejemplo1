import java.util.*;
class Cliente{
	private String nombre;
	private int monto;
	public Cliente(String nom){
		nombre=nom;
		monto=0;
	}
	public void depositar(int m){
		monto=monto+m;
	}
	public void retirar(int m){
		monto=monto-m;
	}
	public int retornarMonto(){
		return monto;
	}
	public void imprimir(){
		System.out.println(nombre+" tiene depositado la suma de "+monto);
	}
}
class Banco{
	Scanner leer=new Scanner(System.in);
	private Cliente c1,c2,c3,c4,c5,c6,c7,c8,c9,c0;
	private String C1,C2,C3,C4,C5,C6,C7,C8,C9,C0;
	public Banco(){
		System.out.println("Cliente 1:");
		C1=leer.next();
		c1=new Cliente(""+C1);
		System.out.println("Cliente 2:");
		C2=leer.next();
		c2=new Cliente(""+C2);
		System.out.println("Cliente 3:");
		C3=leer.next();
		c3=new Cliente(""+C3);
		System.out.println("Cliente 4:");
		C4=leer.next();
		c4=new Cliente(""+C4);
		System.out.println("Cliente 5:");
		C5=leer.next();
		c5=new Cliente(""+C5);
		System.out.println("Cliente 6:");
		C6=leer.next();
		c6=new Cliente(""+C6);
		System.out.println("Cliente 7:");
		C7=leer.next();
		c7=new Cliente(""+C7);
		System.out.println("Cliente 8:");
		C8=leer.next();
		c8=new Cliente(""+C8);
		System.out.println("Cliente 9:");
		C9=leer.next();
		c9=new Cliente(""+C9);
		System.out.println("Cliente 10:");
		C0=leer.next();
		c0=new Cliente(""+C0);
	}
	void operar(){
		int r,y,t;
		Scanner leer=new Scanner(System.in);
		System.out.println("Seleccione un cliente");
		y=leer.nextInt();
		if(y==1||y==2||y==3||y==4||y==5||y==6||y==7||y==8||y==9||y==10){
			System.out.println("Selecciono el cliente numero:"+y);
		System.out.println("Para depositar presione 1");
		System.out.println("Para retirar presione 2");
		System.out.println("Para salir presione 3");
		r=leer.nextInt();
		if(r==1){
			System.out.println("Cuanto desea depositar");
			System.out.println("Para salir presione 2");
			t=leer.nextInt();
			if(y==1){
			c1.depositar(t);
			}
			if(y==2){
		    c2.depositar(t);
			}
			if(y==3){
				c3.depositar(t);
			}
			if(y==4){
				c4.depositar(t);
			}
			if(y==5){
				c5.depositar(t);
			}
			if(y==6){
				c6.depositar(t);
			}
			if(y==7){
				c7.depositar(t);
			}
			if(y==8){
				c8.depositar(t);
			}
			if(y==9){
				c9.depositar(t);
			}
			if(y==10){
				c0.depositar(t);
			}
		}
		if(r==2){
			do{
			System.out.println("Cuanto desea retirar");
			System.out.println("Para salir presione 2");
			t=leer.nextInt();
			if(y==1){
			c1.retirar(t);
			}
			if(y==2){
				c2.retirar(t);
			}
			if(y==3){
				c3.retirar(t);
			}
			if(y==4){
				c4.retirar(t);
			}
			if(y==5){
				c5.retirar(t);
			}
			if(y==6){
		c6.retirar(t);
	}
	        if(y==7){
				c7.retirar(t);
			}
			if(y==8){
				c8.retirar(t);
			}
			if(y==9){
				c9.retirar(t);
			}
			if(y==10){
				c0.retirar(t);
			}
			}while(t==2);
		}
		if(r==3){
		}
	}
	}
	
	void depositosTotales(){
		int t=c1.retornarMonto() + c2.retornarMonto() + c3.retornarMonto() + c4.retornarMonto() + c5.retornarMonto() + c6.retornarMonto() + c7.retornarMonto() + c8.retornarMonto() + c9.retornarMonto() + c0.retornarMonto();
		System.out.println("El total de dinero en el banco es:"+t);
		c1.imprimir();
		c2.imprimir();
		c3.imprimir();
		c4.imprimir();
		c5.imprimir();
		c6.imprimir();
		c7.imprimir();
		c8.imprimir();
		c9.imprimir();
		c0.imprimir();
	}
	public static void main(String[]ar){
		Banco banco1=new Banco();
		banco1.operar();
		banco1.depositosTotales();
	}}
