package com.itcast.service;

import com.itcast.model.Item;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: zcs
 * @create: 2019/1/4 10:44
 **/
@Service
public class ItemService {

    private static final Map<Long,Item> MAP=new HashMap<Long,Item>();
    static {
        MAP.put(1L,new Item(1L,"商品标题1","http://1.jpg","商品描述1",1000L));
        MAP.put(2L,new Item(2L,"商品标题2","http://2.jpg","商品描述2",1000L));
        MAP.put(3L,new Item(3L,"商品标题3","http://3.jpg","商品描述3",1000L));
        MAP.put(4L,new Item(4L,"商品标题4","http://4.jpg","商品描述4",1000L));
        MAP.put(5L,new Item(5L,"商品标题5","http://5.jpg","商品描述5",1000L));
        MAP.put(6L,new Item(6L,"商品标题6","http://6.jpg","商品描述6",1000L));
        MAP.put(7L,new Item(7L,"商品标题7","http://7.jpg","商品描述7",1000L));
        MAP.put(8L,new Item(8L,"商品标题8","http://8.jpg","商品描述8",1000L));
    }

    /**
     * 模拟实现商品查询
     * @param id
     * @return
     */
    public Item queryItemById(Long id){
        return MAP.get(id);
    }
}
