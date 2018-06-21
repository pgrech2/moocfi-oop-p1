public class Money {
    private final int euros;
    private final int cents;

    public Money (int euros, int cents){
        if(cents > 99){
            euros += cents / 100;
            cents %= 100;
        }
        this.euros = euros;
        this.cents = cents;
    }

    public int euros(){
        return euros;
    }

    public int cents(){
        return cents;
    }

    public int inCents(){
        return this.euros * 100 + this.cents;
    }

    public String toString(){
        String zero = "";
        if (cents <= 10){
            zero = "0";
        }
        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added){
        int cents = added.cents() + this.cents;
        int euros = added.euros() + this.euros;

        if(cents > 99){
            euros += cents / 100;
            cents %= 100;
        }
        return new Money(euros, cents);
    }

    public Money minus(Money decremented){
        int thisCents = this.inCents();
        int decCents = decremented.inCents();

        int euros = 0;
        int cents = thisCents - decCents;

        if (cents < 0){
            return new Money(0, 0);
        } else {
            if(cents > 99){
                euros += cents / 100;
                cents %= 100;
            }
            return new Money(euros, cents);
        }
    }

    public boolean less(Money compared){
        if(this.inCents() < compared.inCents()){
            return true;
        }else {
            return false;
        }

    }
}
