package org.example.server;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AccountDatabase {
    private static final Map<Integer,Integer> MAP = IntStream.rangeClosed(1,10)
            .boxed()
            .collect(Collectors.toMap(Function.identity(),(v) -> 100)
            );

    public static int getBalance(int accountID){
        return MAP.get(accountID);
    }

    public static int addBalance(int accountId,int amount)
    {
        return MAP.computeIfPresent(accountId,(k,v)->v+amount);
    }

    public static int deductBalance(int accountId,int amount)
    {
        return MAP.computeIfPresent(accountId,(k,v)->v-amount);
    }


    public static void printAccountDetails(){
        System.out.println(MAP);
    }
}
