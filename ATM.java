import java.util.Scanner;

class ATM {

    public int amt, id,total = 1000,trans=0;
    String transHis;

    void transaction() {
        if(trans==0)
        {
        System.out.println("NO TRANSACTION");
        }
       else{
            System.out.println("\nTransaction"+transHis);
        }
    }

    void withdraw(int amt, int total) {
        System.out.println("Enter amount=");
        Scanner s = new Scanner(System.in);
        amt = s.nextInt();
        if(amt<=total)
        {
            total = total - amt;
            System.out.println("WITHDRAWAL SECCESSFULL");
        System.out.println("Total amount=");
        System.out.print(total);
        trans+=1;
                
                String str=("Rs "+amt+" withdrawal");
                transHis=transHis.concat(str);
        }
        else{
            System.out.println("Isufficient Balance.");
        }
       
        
        s.close();
    }

    void deposite(int amt, int total) {
        System.out.println("Enter amount=");
        Scanner s = new Scanner(System.in);
        amt = s.nextInt();
        total = total + amt;
        System.out.println("DEPOSITE SECCESSFULL");
        System.out.println("Total amount=");
        System.out.print(total);
        trans++;
        String str=("Rs "+amt+" Deposite.");
        transHis=transHis.concat(str);
        s.close();
    }

    void transfer(String id,int amt) {
        System.out.println("Enter id where to transfer=");
        Scanner s= new Scanner(System.in);
        id=s.nextLine();
        System.out.println("Enter amount=");
        amt=s.nextInt();
        if(amt<=total)
        {
            System.out.println("Rs "+amt+" Transfer to  "+id);
            trans++;
            String str=("Rs "+amt+" Transfer to  "+id);
            transHis=transHis.concat(str);
        }
        else{
            System.out.println("Insufficient Amount.");
        }
       
        s.close();
    }

    public static void main(String args[]) {
        ATM o = new ATM();
        int pin, amt = 0, total = 1000;
        String id;
        String rid = "pm";
        System.out.println("Enter id:");
        Scanner s = new Scanner(System.in);
        id = s.nextLine();
        System.out.println("Enter Pin:");
        pin = s.nextInt();

        
            if (pin == 1234 && id.equals(rid))
             {
                System.out.println("1.Transaction History");
                System.out.println("2.Withdraw");
                System.out.println("3.Deposite");
                System.out.println("4.Transfer");
                System.out.println("5.Quit");
                int ch;
                System.out.println("Enter Trasaction:");
                ch = s.nextInt();
                
                
                switch (ch) 
                {
                    case 1:
                        o.transaction();
                        break;
                    case 2:
                        o.withdraw(amt, total);
                        break;
                    case 3:
                        o.deposite(amt, total);
                        break;
                    case 4:
                        o.transfer(id,amt);
                        break;
                    case 5:
                        System.exit(0);

                    default:
                        System.out.println("invalid..");
                        break;
                }
            }
            else {
                if (!id.equals(rid)) {
                    System.out.println("invalid id...");
                } else {
                    System.out.println("incorrect pin...");
                }
            }
            s.close();
        

    }

}
