package org.springboot.tree.tree;

import net.sf.json.JSONArray;
import org.springboot.tree.tree.entity.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TreeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TreeApplication.class, args);
    }


    @GetMapping("/getTree")
    public Object getTree(){
        TestController menuCacheService = new TestController();
        JSONArray jsonArray = new JSONArray();
        Menu menu1 = new Menu();
        menu1.setId(1l);
        menu1.setParentId(0);
        menu1.setTreeName("父节点1号");
        Menu menu2 = new Menu();
        menu2.setId(2l);
        menu2.setParentId(0);
        menu2.setTreeName("父节点2号");
        Menu menu3 = new Menu();
        menu3.setId(3l);
        menu3.setParentId(2);
        menu3.setTreeName("子节点");
        Menu menu4 = new Menu();
        menu4.setId(4l);
        menu4.setParentId(2);
        menu4.setTreeName("子节点");
        Menu menu5 = new Menu();
        menu5.setId(5l);
        menu5.setParentId(4);
        menu5.setTreeName("子节点");
        Menu menu6 = new Menu();
        menu6.setId(6l);
        menu6.setParentId(1);
        menu6.setTreeName("0000");

        jsonArray.add(menu1);
        jsonArray.add(menu2);
        jsonArray.add(menu3);
        jsonArray.add(menu4);
        jsonArray.add(menu5);
        jsonArray.add(menu6);
        JSONArray menuList = menuCacheService.treeMenuList(jsonArray, 0);
        return menuList;
    }
}
