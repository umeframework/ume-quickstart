package org.umeframework.quickstart.app;

import org.umeframework.dora.tool.exp.db.Excel2DbExporter;

/**
 * 1.根据Excel输入的Table列表信息及数据库连接信息，查询数据字典获取表定义的结构。<br> 
 * 2.根据上述结构生成数据库表设计文档。<br>
 * 
 * @author Yue MA
 */
public class ExpTableDefine {

	/**
	 * 主函数.<br>
	 * 允许方法：Eclipse中右键点击该类，选择[Run As] - [Java Application]选项执行.<br>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		try {
		    Excel2DbExporter e2e = new Excel2DbExporter();
		    e2e.setDatabaseType("mysql");
            //e2e.setDatabaseType("oracle");
		    e2e.expTableDefine("input/exp-table-define");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
