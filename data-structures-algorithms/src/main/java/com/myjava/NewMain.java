package com.myjava;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NewMain {
	public static void main(String[] args) {
		String[][] queries=new String[][] {{"CREATE_ACCOUNT","1","account1"}, 
		                                    {"CREATE_ACCOUNT","2","account2"}, 
		                                    {"CREATE_ACCOUNT","3","account3"}, 
		                                    {"DEPOSIT","4","account1","1000"}, 
		                                    {"DEPOSIT","5","account2","1000"}, 
		                                    {"DEPOSIT","6","account3","1000"}, 
		                                    {"PAY","7","account2","100"}, 
		                                    {"PAY","8","account2","100"}, 
		                                    {"PAY","9","account3","100"}, 
		                                    {"TOP_ACTIVITY","10","3"}};
	 String[]  result=new NewMain().solution(queries);
		                                 
	 Arrays.stream(result).forEach(System.out::println);
	}
	String[] solution(String[][] queries) {
	    String[] result=new String[queries.length];
	    HashMap<String, Integer> accounts=new HashMap<>();
	    HashMap<String, Integer> accountsTransactions=new HashMap<>();
	    for(int i=0;i<queries.length;i++)
	    {
	        String transactionType=queries[i][0];
	        String accountName=queries[i][2];
	        if(transactionType.equals("CREATE_ACCOUNT"))
	        {
	            result[i]=createAccount(accounts,queries[i][2])?"true":"false";
	            accountsTransactions.put(accountName, accountsTransactions.getOrDefault(accountName, 0)+1);
	        }
	        else if(transactionType.equals("DEPOSIT"))
	        {
	            result[i]=depositAmount(accounts,accountName,queries[i][3]);
	            accountsTransactions.put(accountName, accountsTransactions.getOrDefault(accountName, 0)+1);
	        }
	        else if(transactionType.equals("PAY"))
	        {
	            result[i]=payOrWithdrawAmount(accounts,accountName,queries[i][3]);
	            accountsTransactions.put(accountName, accountsTransactions.getOrDefault(accountName, 0)+1);
	        }
	        else if(transactionType.equals("TOP_ACTIVITY"))
	        {
	        	 StringBuilder topAccounts=new StringBuilder();
	             LinkedHashMap<String,Integer> sortedaccountsTransactions = accountsTransactions.entrySet().stream().sorted((v1,v2)->
	             {
	                 if(v2.getValue()-v1.getValue()==0) return sortNames(v1.getKey(),v2.getKey());
	                 return v2.getValue()-v1.getValue();
	             }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(x,y)->y,LinkedHashMap::new));
	             int count=0;
	             for(Map.Entry<String,Integer> accountsTransaction:sortedaccountsTransactions.entrySet())
	             {
	                 if(count>=Integer.parseInt(queries[i][2]))
	                 {
	                     break;
	                 }
	                 topAccounts.append(accountsTransaction.getKey());
	                 topAccounts.append("(");
	                 topAccounts.append(accounts.get(accountsTransaction.getKey()));
	                 topAccounts.append(")");
	                 count++;
	             }
	             result[i]=String.valueOf(topAccounts);
	        }
	        else{
	            result[i]="";
	        }
	    }
	    return result;
	}
	public int sortNames(String s1,String s2)
	{
	    for(int i=0;i<s1.length()&&i<s2.length();i++)
	    {
	        if(s1.charAt(i)>s2.charAt(i)) return -1;
	        else if(s1.charAt(i)<s2.charAt(i)) return 1;
	    }
	    return 0;
	}
	public boolean createAccount(HashMap<String, Integer> accounts,String accountName)
	{
	    if(accountExists(accounts,accountName))
	    {
	        return false;
	    }
	    accounts.put(accountName, 0);
	    return true;
	}
	public boolean accountExists(HashMap<String, Integer> accounts,String accountName)
	{
	    if(accounts.containsKey(accountName))
	    {
	        return true;
	    }
	    return false;
	}

	public String depositAmount(HashMap<String, Integer> accounts,String accountName, String amount)
	{
	    if(!accountExists(accounts,accountName))
	    {
	        return "";
	    }
	    Integer currAmt=Integer.parseInt(amount);
	    Integer totalAmount=currAmt+accounts.get(accountName);
	    accounts.put(accountName,totalAmount);
	    return String.valueOf(totalAmount);
	}

	public String payOrWithdrawAmount(HashMap<String, Integer> accounts,String accountName, String amount)
	{
	    Integer currAmt=Integer.parseInt(amount);
	    if(!accountExists(accounts,accountName) || currAmt>accounts.get(accountName))
	    {
	        return "";
	    }    
	    Integer totalAmount=accounts.get(accountName)-currAmt;
	    accounts.put(accountName,totalAmount);
	    return String.valueOf(totalAmount);
	}
}