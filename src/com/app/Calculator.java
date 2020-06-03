package com.app;
public class Calculator {
    private Double firstNumber;
    private Double secondNumber;

    public Double getFirst()
    {
        return firstNumber;
    }
    public Double getSecond()
    {
        return secondNumber;
    }
    public void setFirst(Double n)
    {
        this.firstNumber = n;
    } 
    public void setSecond(Double n)
    {
        this.secondNumber = n;
    }

    public Double add()
    {
        return getFirst()+getSecond();
    }

    public Double subtract()
    {
        return getFirst()-getSecond();
    }
    public Double multiply()
    {
        return getFirst()*getSecond();
    }
    public Double divide()
    {
        return (getSecond()==0)?0:getFirst()/getSecond();
    }
}