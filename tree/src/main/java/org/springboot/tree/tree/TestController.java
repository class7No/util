package org.springboot.tree.tree;



import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springboot.tree.tree.entity.Menu;
import org.springboot.tree.tree.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;


/**
 * @program: Test
 * @description:
 * @author: HuaHua.L
 * @date: 2019-11-26 15:26
 **/
public class TestController {

    //菜单树形结构
    public JSONArray treeMenuList(JSONArray menuList, Integer parentId) {
        JSONArray childMenu = new JSONArray();
        for (Object object : menuList) {
            JSONObject jsonMenu = JSONObject.fromObject(object);
            int menuId = jsonMenu.getInt("id");
            int pid = jsonMenu.getInt("parentId");
            if (parentId == pid) {
                JSONArray c_node = treeMenuList(menuList, menuId);
                jsonMenu.put("childNode", c_node);
                childMenu.add(jsonMenu);
            }
        }
        return childMenu;
    }


    public static void main(String args[]) {
        TestController menuCacheService = new TestController();
        JSONArray jsonArray = new JSONArray();
        Menu menu1 = new Menu();
        menu1.setId(1l);
        menu1.setParentId(null);
        menu1.setTreeName("父节点1号");
        Menu menu2 = new Menu();
        menu2.setId(2l);
        menu2.setParentId(null);
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
        JSONArray menuList = menuCacheService.treeMenuList(jsonArray, null);

    }

}
