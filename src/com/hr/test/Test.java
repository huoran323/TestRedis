package com.hr.test;

import redis.clients.jedis.Jedis;

public class Test {

	public static void main(String[] args) {
		
		Jedis jedis = new Jedis("192.168.95.128", 6379);
		String result = jedis.ping();
		System.out.println(result);
		jedis.set("a", "张三");
		String a = jedis.get("a");
		System.out.println(a);
		jedis.close();
	}
}
