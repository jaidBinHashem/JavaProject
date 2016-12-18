import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

class food{
	private String name;
	private double price;
	
	public food()
	{
		
	}
	
	public void setName(String namee)
	{
		this.name=namee;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	
	public void setItem(String namee,double price)
	{
		this.name=namee;
		this.price=price;
		
	}
	
}



class indianAppetizer{
	private food indianAppetizer[];
	
	public indianAppetizer()
	{
		
	}
	
	
	public void setAll()
	{
		indianAppetizer=new food[7];
		for(int i=0;i<7;i++)
		{
			indianAppetizer[i]=new food();
		}
		
		indianAppetizer[0].setItem("Paani Puri",130);
		indianAppetizer[1].setItem("Dahi Fuchka",150);
		indianAppetizer[2].setItem("Papri Chaat.",130);
		indianAppetizer[3].setItem("Aloo Pudina Raita",150);
		indianAppetizer[4].setItem("Mixed Veg Raita",220);
		indianAppetizer[5].setItem("Soup of the Day",350);
		indianAppetizer[6].setItem("Plain Dosa",150);
	}
	
	public void showMenu()
	{
		System.out.println("\nIndian Appetizer:");
		System.out.println("");
		for(int i=0;i<7;i++)
		{
			System.out.print(i+1);
			System.out.println(":"+indianAppetizer[i].getName()+"------------Price:"+indianAppetizer[i].getPrice());
		}
		System.out.println("");
	}
	
	public String getName(int index)
	{
		return indianAppetizer[index].getName();
	}
	
	public double getPrice(int index)
	{
		return indianAppetizer[index].getPrice();
	}
	
	
	
}

class starterAppetizer{
	private food starterAppetizer[];
	
	public starterAppetizer()
	{
		
	}
	
	public void setAll()
	{
		starterAppetizer=new food[7];
		for(int i=0;i<7;i++)
		{
			starterAppetizer[i]=new food();
		}
		
		starterAppetizer[0].setItem("Chicken N' Nuts Crispy Salad",150);
		starterAppetizer[1].setItem("Chicken N' Nuts Crispy Salad Special",350);
		starterAppetizer[2].setItem("Chicken Wings Garlic Toasted",320);
		starterAppetizer[3].setItem("Prawn with Garlic Pepper",340);
		starterAppetizer[4].setItem("Tarka Special French Fries",150);
		starterAppetizer[5].setItem("Chicken Pakora",320);
		starterAppetizer[6].setItem("Prawn Pakora",320);
	}
	
	public void showMenu()
	{
		System.out.println("\nStarter Appetizer:");
		System.out.println("");
		for(int i=0;i<7;i++)
		{
			System.out.print(i+1);
			System.out.println(":"+starterAppetizer[i].getName()+"------------Price:"+starterAppetizer[i].getPrice());
		}
		System.out.println("");
	}
	
        public String getName(int index)
	{
		return starterAppetizer[index].getName();
	}
	
	public double getPrice(int index)
	{
		return starterAppetizer[index].getPrice();
	}
	
	
	
}

class tandooriKabab{
	private food tandooriKabab[];
	
	public tandooriKabab()
	{
		
	}
	
	public void setAll()
	{
		tandooriKabab=new food[7];
		for(int i=0;i<7;i++)
		{
			tandooriKabab[i]=new food();
		}
		
		tandooriKabab[0].setItem("Tandoori Chicken",499);
		tandooriKabab[1].setItem("Mughal Chicken",390);
		tandooriKabab[2].setItem("Chicken Tengri Kabab",340);
		tandooriKabab[3].setItem("Chicken Reshmi Kabab",350);
		tandooriKabab[4].setItem("Chicken Bhupali Kabab",360);
		tandooriKabab[5].setItem("Chicken Tikka Kabab",350);
		tandooriKabab[6].setItem("Chicken Lassoni Kabab",150);
	}
        
        public String getName(int index)
	{
		return tandooriKabab[index].getName();
	}
	
	public double getPrice(int index)
	{
		return tandooriKabab[index].getPrice();
	}
	
	public void showMenu()
	{
		System.out.println("\nTandoori Kabab:");
		System.out.println("");
		for(int i=0;i<7;i++)
		{
			System.out.print(i+1);
			System.out.println(":"+tandooriKabab[i].getName()+"------------Price:"+tandooriKabab[i].getPrice());
		}
		System.out.println("");
        }	
}

class platter{
	private food platter[];
	
	public platter()
	{
		
	}
	
	public void setAll()
	{
		platter=new food[7];
		for(int i=0;i<7;i++)
		{
			platter[i]=new food();
		}
		
		platter[0].setItem("Tarka Special Mixed Platter",777);
		platter[1].setItem("Mega Mixed Tandoori Platter",1999);
	}
	
	public void showMenu()
	{
		System.out.println("\nPlatter:");
		System.out.println("");
		for(int i=0;i<2;i++)
		{
			System.out.print(i+1);
			System.out.println(":"+platter[i].getName()+"------------Price:"+platter[i].getPrice());
		}
		System.out.println("");
	}
	
	public String getName(int index)
	{
		return platter[index].getName();
	}
	
	public double getPrice(int index)
	{
		return platter[index].getPrice();
	}
}



class mainDishes{
	private food mainDishes[];
	
	public mainDishes()
	{
		
	}
        
        public String getName(int index)
	{
		return mainDishes[index].getName();
	}
	
	public double getPrice(int index)
	{
		return mainDishes[index].getPrice();
	}
	
	public void setAll()
	{
		mainDishes=new food[7];
		for(int i=0;i<7;i++)
		{
			mainDishes[i]=new food();
		}
		
		mainDishes[0].setItem("Chicken Reshmi Butter Masala",380);
		mainDishes[1].setItem("Chicken Tikka Masala",380);
		mainDishes[2].setItem("Chicken Jhalfry",370);
		mainDishes[3].setItem("AloChicken Peshwari Kadhai",350);
		mainDishes[4].setItem("Chicken Lajawab Makhani",399);
		mainDishes[5].setItem("Chicken Butter Masala",390);
		mainDishes[6].setItem("Mutton Vindaloo",410);
	}
	
	public void showMenu()
	{
		System.out.println("\nMain Dishes:");
		System.out.println("");
		for(int i=0;i<7;i++)
		{
			System.out.print(i+1);
			System.out.println(":"+mainDishes[i].getName()+"------------Price:"+mainDishes[i].getPrice());
		}
		System.out.println("");
	}	
}


class riceRoti{
	private food riceRoti[];
	
	public riceRoti()
	{
		
	}
        
        public String getName(int index)
	{
		return riceRoti[index].getName();
	}
	
	public double getPrice(int index)
	{
		return riceRoti[index].getPrice();
	}
	
	public void setAll()
	{
		riceRoti=new food[7];
		for(int i=0;i<7;i++)
		{
			riceRoti[i]=new food();
		}
		
		riceRoti[0].setItem("Mutton Hyderabadi Biryani",360);
		riceRoti[1].setItem("Chicken Lucknowi Biryani",360);
		riceRoti[2].setItem("Jeera Pulao",200);
		riceRoti[3].setItem("Plain Pulao",180);
		riceRoti[4].setItem("Kashmiri Pulao",280);
		riceRoti[5].setItem("Plain Naan",50);
		riceRoti[6].setItem("PlButter Naan",55);
	}
	
	public void showMenu()
	{
		System.out.println("\nRice Roti:");
		System.out.println("");
		for(int i=0;i<7;i++)
		{
			System.out.print(i+1);
			System.out.println(":"+riceRoti[i].getName()+"------------Price:"+riceRoti[i].getPrice());
		}
		System.out.println("");
	}	
}


class roll{
	private food roll[];
	
	public roll()
	{
		
	}
        
        public String getName(int index)
	{
		return roll[index].getName();
	}
	
	public double getPrice(int index)
	{
		return roll[index].getPrice();
	}
	
	public void setAll()
	{
		roll=new food[7];
		for(int i=0;i<7;i++)
		{
			roll[i]=new food();
		}
		
		roll[0].setItem("Beef Roll",130);
		roll[1].setItem("Beef Egg Roll",170);
		roll[2].setItem("Sweet n Sour Roll",160);
		roll[3].setItem("Chicken Roll",140);
		roll[4].setItem("MixChicken Egg Roll",160);
		roll[5].setItem("Special Roll",270);
		//roll[6].setItem("Plain Dosa",150);
	}
	
	public void showMenu()
	{
		System.out.println("\nRoll:");
		System.out.println("");
		for(int i=0;i<6;i++)
		{
			System.out.print(i+1);
			System.out.println(":"+roll[i].getName()+"------------Price:"+roll[i].getPrice());
		}
		System.out.println("");
	}	
}

class orderItem{
        int countOrder=0;
        Scanner sc=new Scanner(System.in);
        food orderFood[];
        indianAppetizer ia;
        starterAppetizer sa;
        tandooriKabab tk;
        platter p;
        mainDishes md;
        riceRoti rr;
        roll ro;
        double totalBill;
        double bill=0;
	double vat=0;
        public orderItem(indianAppetizer ia,starterAppetizer sa,tandooriKabab tk,platter p,mainDishes md,riceRoti rr,roll ro){
            this.ia=ia;
            this.md=md;
            this.p=p;
            this.ro=ro;
            this.rr=rr;
            this.sa=sa;
            this.tk=tk;
        }
        public void takeOrder(int product_Quantity){
            orderFood=new food[product_Quantity];
            ia.showMenu();
            sa.showMenu();
            tk.showMenu();
            p.showMenu();
            md.showMenu();
            rr.showMenu();
            ro.showMenu();
            
            
            
            
            
        for(int i=0;i<product_Quantity;i++){
            orderFood[i]=new food();
            System.out.println("1 for Indian Appetizer");
            System.out.println("2 for Starter Appetizer");
            System.out.println("3 for Tandoori Kabab");
            System.out.println("4 for Platter");
            System.out.println("5 for Main Dishes");
            System.out.println("6 for Rice Roti");
            System.out.println("7 for Roll");
	    System.out.println("0 for Bill");
	    System.out.println("");
		
            int choise=0;
            System.out.print("Enter choise:");
            choise=sc.nextInt();
                
            if(choise==1){
                ia.showMenu();
                System.out.print("Enter Your choise number:");
                int oc=sc.nextInt();
                orderFood[i].setName(ia.getName((oc-1)));
                orderFood[i].setPrice(ia.getPrice((oc-1)));
                countOrder++;
            }
                
                else if(choise==2){
                    sa.showMenu();
                    System.out.print("Enter Your choise number:");
                    int oc=sc.nextInt();
                    orderFood[i].setName(sa.getName(oc-1));
                    orderFood[i].setPrice(sa.getPrice(oc-1));
                    countOrder++;
                }
                
                else if(choise==3){
                    tk.showMenu();
                    System.out.print("Enter Your choise number:");
                    int oc=sc.nextInt();
                    orderFood[i].setName(tk.getName(oc-1));
                    orderFood[i].setPrice(tk.getPrice(oc-1));
                    countOrder++;
                }
                
                else if(choise==4){
                    p.showMenu();
                    System.out.print("Enter Your choise number:");
                    int oc=sc.nextInt();
                    orderFood[i].setName(p.getName(oc-1));
                    orderFood[i].setPrice(p.getPrice(oc-1));
                    countOrder++;
                }
                
                else if(choise==5){
                    md.showMenu();
                    System.out.print("Enter Your choise number:");
                    int oc=sc.nextInt();
                    orderFood[i].setName(md.getName(oc-1));
                    orderFood[i].setPrice(md.getPrice(oc-1));
                    countOrder++;
                }
                
                else if(choise==6){
                    rr.showMenu();
                    System.out.print("Enter Your choise number:");
                    int oc=sc.nextInt();
                    orderFood[i].setName(rr.getName(oc-1));
                    orderFood[i].setPrice(rr.getPrice(oc-1));
                    countOrder++;
                }
                
                else if(choise==7){
                    ro.showMenu();
                    System.out.print("Enter Your choise number:");
                    int oc=sc.nextInt();
                    orderFood[i].setName(ro.getName(oc-1));
                    orderFood[i].setPrice(ro.getPrice(oc-1));
                    countOrder++;
                }
            }
        
        for(int i=0;i<countOrder;i++)
        {
            bill=bill+orderFood[i].getPrice();
        }
        
        for(int i=0;i<countOrder;i++){
            System.out.println("You have ordered:"+orderFood[i].getName());
        }
        
	vat=bill/100*15;
        System.out.println("");
        System.out.println("");
        System.out.println("Bill:"+bill);
	System.out.println("Vat:"+vat);
	System.out.println("Total Bill:"+(bill+vat));
        totalBill=bill+vat;
        
        WindowMenu win=new WindowMenu(orderFood,vat,bill,totalBill);
        win.setVisible(true);
        
    }
};

class WindowMenu extends Frame{
    TextField t;
    final double vat,bill;
    double totalBill;
    String[] message;
    String[] itemNames;
    food items[];
    Button showItem,showTotalBill,ShowVat,showBill;
    
    WindowMenu(final food items[],double vat,double bill,double totalBill){
        this.totalBill=totalBill;
        this.items=items;
        this.bill=bill;
        this.vat=vat;
        this.setResizable(false);
        this.setTitle("Order Detail");
        this.setSize(400,300);
        this.setBackground(new Color (0,51,204));
        this.setFont(new Font("Tahoma", 1, 16));
        this.setLayout(null);
        
        t=new TextField();
        t.setLocation(10, 30);
        t.setSize(380, 50);
        t.setEditable(false);
        this.add(t);
        
        showItem=new Button("Show Item");
        showItem.setBackground(Color.GREEN);
        showItem.setSize(180, 70);
        showItem.setLocation(10,135);
        showItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(int i=0;i<items.length;i++){
                    if(i==0){
                        t.setText("Ordered Items:"+items[i].getName()+",");
                    }
                    else{
                        t.setText(t.getText()+"   "+items[i].getName()+",");
                    }
                }
            }
        
        });
        this.add(showItem);
        
        showBill=new Button("Show Bill");
        showBill.setBackground(Color.GREEN);
        showBill.setSize(180, 70);
        showBill.setLocation(210,135);
        buttonSensorShowBill sb=new buttonSensorShowBill(t,bill);
        showBill.addActionListener(sb);
        this.add(showBill);
        
        ShowVat=new Button("Show Vat");
        ShowVat.setBackground(Color.GREEN);
        ShowVat.setSize(180, 70);
        ShowVat.setLocation(10,215);
        buttonSensorShowVat sv=new buttonSensorShowVat(t,vat);
        ShowVat.addActionListener(sv);
        this.add(ShowVat);
        
        showTotalBill=new Button("Show Total Bill");
        showTotalBill.setBackground(Color.GREEN);
        showTotalBill.setSize(180, 70);
        showTotalBill.setLocation(210,215);
        buttonSensorShowTotalBill stb=new buttonSensorShowTotalBill(t,totalBill);
        showTotalBill.addActionListener(stb);
        this.add(showTotalBill);
        
        
        
        
        this.addWindowListener(new WindowAdapter(){
           @Override
           public void windowClosing(WindowEvent w){
           System.exit(0);
        }
        });
    }
}

class buttonSensorShowBill implements ActionListener{
    TextField te;
    double bill;
    buttonSensorShowBill(TextField t,double bill){
        this.te=t;
        this.bill=bill;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        te.setText("Your Bill:"+bill);
    }
};

class buttonSensorShowVat implements ActionListener{
    TextField te;
    double vat;
    
    buttonSensorShowVat(TextField t,double vat){
        this.te=t;
        this.vat=vat;
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        te.setText("Your Vat:"+vat);
    }
};

class buttonSensorShowTotalBill implements ActionListener{
    TextField te;
    double totalBill;
    
    buttonSensorShowTotalBill(TextField t,double totalBill){
        this.te=t;
        this.totalBill=totalBill;
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        te.setText("Your Total Bill:"+totalBill);
    }
};



public class project{
	public static void main(String args[]){
            indianAppetizer inobj=new indianAppetizer();
            inobj.setAll();
            inobj.showMenu();
            
            starterAppetizer stobj=new starterAppetizer();
            stobj.setAll();
            stobj.showMenu();
            
            tandooriKabab tkobj=new tandooriKabab();
            tkobj.setAll();
            tkobj.showMenu();
            
            platter ptobj=new platter();
            ptobj.setAll();
            ptobj.showMenu();
            
            mainDishes mdobj=new mainDishes();
            mdobj.setAll();
            mdobj.showMenu();
            
            riceRoti rrobj=new riceRoti();
            rrobj.setAll();
            rrobj.showMenu();
            
            roll roobj=new roll();
            roobj.setAll();
            roobj.showMenu();
            
            Scanner sci=new Scanner(System.in);
            System.out.print("Number of dishes you want to order-");
            int quan=sci.nextInt();
            orderItem order=new orderItem(inobj,stobj,tkobj,ptobj,mdobj,rrobj,roobj);
            order.takeOrder(quan);
            
            
        }
}
	
