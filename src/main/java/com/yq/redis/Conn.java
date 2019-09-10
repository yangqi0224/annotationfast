package com.yq.redis;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.yq.tool.String2Set;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public class Conn {
    Properties properties = new Properties();
    Set<HostAndPort> set  = new HashSet<HostAndPort>();
    JedisCluster jedisCluster;

    @Before
    public void init() throws Exception{
        properties.load(new FileInputStream("C:\\Users\\yangqi\\Desktop\\annotationfast\\src\\main\\resources\\redis-host.properties"));
        /*set.add(new HostAndPort("192.168.232.130", 6379));
        set.add(new HostAndPort("192.168.232.130", 7379));
        set.add(new HostAndPort("192.168.232.131", 6379));
        set.add(new HostAndPort("192.168.232.131", 7379));
        set.add(new HostAndPort("192.168.232.132", 6379));
        set.add(new HostAndPort("192.168.232.132", 7379));*/
        properties.getProperty("redis-url");
        String2Set.string2Set(properties.getProperty("redis-url"), set);
        jedisCluster = new JedisCluster(set);
    }

    @Test
    public void redis() {
        //jedisCluster.set("age", "22");
        //System.out.println(jedisCluster.get("yq"));

    }
}
