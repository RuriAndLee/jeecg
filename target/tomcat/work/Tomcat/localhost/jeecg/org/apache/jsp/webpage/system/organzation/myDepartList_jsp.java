/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-06-08 06:27:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.webpage.system.organzation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class myDepartList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/tld/easyui.tld", Long.valueOf(1528366866000L));
    _jspx_dependants.put("/context/mytags.jsp", Long.valueOf(1528366866000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;

      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /context/mytags.jsp(9,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("webRoot");
      // /context/mytags.jsp(9,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(basePath);
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>我的机构管理</title>\n");
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"plug-in/ztree/css/zTreeStyle.css\" type=\"text/css\">\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/ztree/js/jquery.ztree.core-3.5.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/ztree/js/ztreeCreator.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"easyui-layout\" fit=\"true\" scroll=\"no\">\n");
      out.write("\t\t<div  data-options=\"region:'west',title:'我的机构管理',split:true\" style=\"width:200px;overflow: auto;\">\n");
      out.write("\t\t   <!-- update-begin--Author:Yandong  Date:20180402 for： TASK #2601 【严重样式问题】我的组织机构，在shortcut风格下样式有问题-->\n");
      out.write("\t\t   <div style=\"width:105px;margin-left: 8px;margin-top: 2px;\">\n");
      out.write("\t\t\t<a  icon=\"icon-add\" class=\"easyui-linkbutton l-btn l-btn-plain\"  onclick=\"addOneNode()\">\n");
      out.write("\t\t\t\t<span class=\"bigger-110 no-text-shadow\" style=\"width: 50px;\">添加公司</span>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- update-begin--Author:Yandong  Date:20180402 for： TASK #2601 【严重样式问题】我的组织机构，在shortcut风格下样式有问题-->\n");
      out.write("\t\t\t <div class=\"clear\"></div> \n");
      out.write("\t        <div id=\"orgTree\" class=\"ztree\"></div>\n");
      out.write("\t        <input type=\"hidden\" id=\"userName\" name=\"userName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div data-options=\"region:'center'\" title=\"\">\n");
      out.write("    <!-- <iframe width=\"100%\" height=\"100%\" id=\"center\"  src=\"\" style=\"border:1px #fff solid; background:#fff;\"></iframe> -->\n");
      out.write("\t\t<div id=\"tt\" tabPosition=\"top\" border=flase style=\"width:100%;height:100%;margin:0px;padding:0px;overflow-x:hidden;width:auto;\" class=\"easyui-tabs\" fit=\"true\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"hidden\">\n");
      out.write("\t\t\t<div id=\"orgMenu\" class=\"easyui-menu\" data-options=\"onClick:menuHandler\" style=\"width: 120px;\">\n");
      out.write("\t\t\t\t<!-- <div data-options=\"name:'addSubCompany'\">添加下级公司</div> -->\n");
      out.write("\t\t\t\t<div data-options=\"name:'addSubOrg'\">添加下级部门</div>\n");
      out.write("\t\t\t\t<div data-options=\"name:'addSubJob'\">添加下级岗位</div>\n");
      out.write("\t\t\t\t<div data-options=\"name:'edit'\">编辑</div> \n");
      out.write("\t\t\t\t<div data-options=\"name:'remove'\">删除 </div> \n");
      out.write("\t\t\t\t<div data-options=\"name:'fresh'\">刷新</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"gysMenu\" class=\"easyui-menu\" data-options=\"onClick:menuHandler\" style=\"width: 120px;\">\n");
      out.write("\t\t\t\t<div data-options=\"name:'addSubOrg'\">添加下级部门</div>\n");
      out.write("\t\t\t\t<div data-options=\"name:'addSubJob'\">添加下级岗位</div>\n");
      out.write("\t\t\t\t<div data-options=\"name:'editSupplier'\">编辑</div> \n");
      out.write("\t\t\t\t<div data-options=\"name:'removeSupplier'\">删除 </div> \n");
      out.write("\t\t\t\t<div data-options=\"name:'fresh'\">刷新</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"gysMenuGW\" class=\"easyui-menu\" data-options=\"onClick:menuHandler\" style=\"width: 120px;\">\n");
      out.write("\t\t\t\t<div data-options=\"name:'addSubOrg'\">添加下级部门</div>\n");
      out.write("\t\t\t\t<div data-options=\"name:'addSubJob'\">添加下级岗位</div>\n");
      out.write("\t\t\t\t<div data-options=\"name:'editSupplier'\">编辑</div> \n");
      out.write("\t\t\t\t<div data-options=\"name:'removeSupplier'\">删除 </div> \n");
      out.write("\t\t\t\t<div data-options=\"name:'fresh'\">刷新</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"gysRootMenu\" class=\"easyui-menu\" data-options=\"onClick:menuHandler\" style=\"width: 120px;\">\n");
      out.write("\t\t\t\t<div data-options=\"name:'fresh'\">刷新</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("<script>\n");
      out.write("$(function() {\n");
      out.write("\tloadTree();\n");
      out.write("});\n");
      out.write("var flag = true;\n");
      out.write("var TimeFn = null;\n");
      out.write("\n");
      out.write("\n");
      out.write("function addtt(title, url, id, icon, closable) {\n");
      out.write("\t$('#tt').tabs('add',{\n");
      out.write("\t\t\t\t\t\tid : id,\n");
      out.write("\t\t\t\t\t\ttitle : title,\n");
      out.write("\t\t\t\t\t\tcontent : createFramett(id,url),\n");
      out.write("\t\t\t\t\t\tclosable : closable = (closable == 'false') ? false\n");
      out.write("\t\t\t\t\t\t\t\t: true,\n");
      out.write("\t\t\t\t\t\ticon : icon\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("$('#tt').tabs({onSelect : function(title) {\n");
      out.write("\t\t\t\t\t\tvar p = $(this).tabs('getTab', title);\n");
      out.write("\t\t\t\t\t\tvar url = p.find('iframe').attr('src');\n");
      out.write("\t\t\t\t\t\tp.find('iframe').attr('src',url);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("function createFramett(id,url) {\n");
      out.write("\tvar s = '<iframe id=\"'+id+'\" scrolling=\"yes\" frameborder=\"0\"  src=\"'+url+'\" width=\"100%\" height=\"100%\"></iframe>';\n");
      out.write("\treturn s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("//beforeDblClick事件\n");
      out.write("function beforeDbl(){\n");
      out.write("\tflag = false;\n");
      out.write("\treturn true;\n");
      out.write("}\n");
      out.write("//加载树\n");
      out.write("var orgTree ;\n");
      out.write("\n");
      out.write("function showIndex(){\n");
      out.write("var treeObj = $.fn.zTree.getZTreeObj(\"orgTree\");\n");
      out.write("var node =treeObj.getNodes()[0];\n");
      out.write("$(\"#\"+node.tId+\" a\").click();\n");
      out.write("}\n");
      out.write("\n");
      out.write("function loadTree() {\n");
      out.write("\tvar zNodes;\n");
      out.write("\tvar ztreeCreator = new ZtreeCreator('orgTree',\"\",\"\")\n");
      out.write("\n");
      out.write(" \t\t\t.setCallback({onClick:zTreeOnLeftClick,onRightClick:zTreeOnRightClick,onDblClick:zTreeOnDblClick,beforeDblClick:beforeDbl,onAsyncSuccess:showIndex})\n");
      out.write("\n");
      out.write(" \t\t\t.setAsync({\n");
      out.write("                enable: true,\n");
      out.write("                url:\"organzationController.do?getMyTreeData\",\n");
      out.write("                autoParam:[\"id\", \"name\", \"level\"],\n");
      out.write("                dataFilter:filter\n");
      out.write("            }) \n");
      out.write(" \t\t\t.initZtree({},function(treeObj){\n");
      out.write(" \t\t\t\torgTree = treeObj\n");
      out.write(" \t\t\t\t});\n");
      out.write("};\n");
      out.write("\n");
      out.write("function filter(treeId, parentNode, childNodes){\n");
      out.write("\tif (!childNodes) return null;\n");
      out.write("    for (var i=0, l=childNodes.length; i<l; i++) {\n");
      out.write("        childNodes[i].name = childNodes[i].name.replace(/\\.n/g, '.');\n");
      out.write("    }\n");
      out.write("    return childNodes;\n");
      out.write("}\n");
      out.write("\n");
      out.write("//左击\n");
      out.write("function zTreeOnLeftClick(event, treeId, treeNode) {\n");
      out.write("\tvar selectNode = getSelectNode();\n");
      out.write("\tflag = true;\n");
      out.write("\tclearTimeout(TimeFn);\n");
      out.write("\tsetTimeout(function(){\n");
      out.write("\t\tif(flag){\n");
      out.write("\t\t\tcurSelectNode = treeNode;\n");
      out.write("\t\t\tvar parentId = treeNode.id;\n");
      out.write("\t\t\tvar orgType = treeNode.orgType;\n");
      out.write("\t\t\tcloseAllTab();\n");
      out.write("\t\t\tif(orgType==\"1\"){\n");
      out.write("\t\t\t\tvar url = \"organzationController.do?comDetail&id=\"+treeNode.id;\n");
      out.write("\t\t\t\taddtt('基本信息', url, '01','icon-comturn', 'false');\n");
      out.write("\t\t\t\turl = \"organzationController.do?myUserOrgList&departid=\"+treeNode.id;\n");
      out.write("\t\t\t\taddtt('用户信息', url, '02','icon-user-set', 'false');\n");
      out.write("\t\t\t\turl = \"tSCompanyPositionController.do?list&companyId=\"+treeNode.id;;\n");
      out.write("\t\t\t\taddtt('职务信息', url, '03','icon-chart-organisation', 'false');\n");
      out.write("\t\t\t}else if(orgType==\"4\"){\n");
      out.write("\t\t\t\tvar url = \"organzationController.do?comDetail&id=\"+treeNode.id;\n");
      out.write("\t\t\t\taddtt('基本信息', url, '01','icon-comturn', 'false');\n");
      out.write("\t\t\t\turl = \"organzationController.do?myUserOrgList&departid=\"+treeNode.id;\n");
      out.write("\t\t\t\taddtt('用户信息', url, '02','icon-user-set', 'false');\n");
      out.write("\t\t\t\turl = \"tSCompanyPositionController.do?list&companyId=\"+treeNode.id;;\n");
      out.write("\t\t\t\taddtt('职务信息', url, '03','icon-chart-organisation', 'false');\n");
      out.write("\t\t\t}else if(orgType==\"9\"){\n");
      out.write("\t\t\t\t//var url = \"organzationController.do?comDetail&id=\"+treeNode.id;\n");
      out.write("\t\t\t\t//addtt('基本信息', url, '01','icon-comturn', 'false');\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\tvar url = \"organzationController.do?comDetail&id=\"+treeNode.id;\n");
      out.write("\t\t\t\taddtt('基本信息', url, '01','icon-comturn', 'false');\n");
      out.write("\t\t\t\turl = \"organzationController.do?myUserOrgList&departid=\"+treeNode.id;\n");
      out.write("\t\t\t\taddtt('用户信息', url, '02','icon-user-set', 'false');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t$(\"#tt\").tabs(\"select\", 0);\n");
      out.write("\t\t}\n");
      out.write("\t},301);\n");
      out.write("};\n");
      out.write("/**\n");
      out.write(" * 树右击事件\n");
      out.write(" */\n");
      out.write("function zTreeOnRightClick(e, treeId, treeNode) {\t\n");
      out.write("\tif (treeNode) {\n");
      out.write("\t\torgTree.selectNode(treeNode);\n");
      out.write("\t\tcurSelectNode=treeNode;\n");
      out.write("\t\tvar isfolder = treeNode.isFolder;\n");
      out.write("\t\tvar h = $(window).height();\n");
      out.write("\t\tvar w = $(window).width();\n");
      out.write("\t\tvar menuWidth = 120;\n");
      out.write("\t\tvar menuHeight = 75;\n");
      out.write("\t\tvar menu = null;\n");
      out.write("\t\tif (treeNode != null) {\n");
      out.write("\t\t\tvar orgType = treeNode.orgType;\n");
      out.write("\t\t\tif(orgType==\"4\"){\n");
      out.write("\t\t\t\tmenu = $('#gysMenu');\n");
      out.write("\t\t\t}else if(orgType==\"9\"){\n");
      out.write("\t\t\t\tmenu = $('#gysRootMenu');\n");
      out.write("\t\t\t}else if(orgType==\"2\"){\n");
      out.write("\t\t\t\tmenu = $('#gysMenu');\n");
      out.write("\t\t\t}else if(orgType==\"3\"){\n");
      out.write("\t\t\t\tmenu = $('#gysMenuGW');\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\tmenu = $('#gysMenu');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\tvar x = e.pageX, y = e.pageY;\n");
      out.write("\t\tif (e.pageY + menuHeight > h) {\n");
      out.write("\t\t\ty = e.pageY - menuHeight;\n");
      out.write("\t\t}\n");
      out.write("\t\tif (e.pageX + menuWidth > w) {\n");
      out.write("\t\t\tx = e.pageX - menuWidth;\n");
      out.write("\t\t}\n");
      out.write("\t\tmenu.menu('show', {\n");
      out.write("\t\t\tleft : x,\n");
      out.write("\t\t\ttop : y\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("};\n");
      out.write("//双击事件\n");
      out.write("function zTreeOnDblClick(event, treeId, treeNode) {\n");
      out.write("\tvar selectNode = getSelectNode();\n");
      out.write("\tcurSelectNode = treeNode;\n");
      out.write("\t//var url = \"functionGroupController.do?groupRel&id=\"+selectNode.id;\n");
      out.write("\t//$(\"#listFrame\").attr(\"src\", url);\n");
      out.write("\t//var url = \"autoFormController/af/employee_leave_form/goAddPage.do\";\n");
      out.write("\t//addtt('基本信息', url, '1','icon-search', 'false');\n");
      out.write("}\n");
      out.write("//菜单对应项\n");
      out.write("function menuHandler(item) {\n");
      out.write("\tif ('addSubCompany' == item.name) {\n");
      out.write("\t\taddSubCompany();\n");
      out.write("\t} else if ('addSubOrg' == item.name) {\n");
      out.write("\t\taddSubOrg();\n");
      out.write("\t} else if ('addSubJob' == item.name) {\n");
      out.write("\t\taddSubJob();\n");
      out.write("\t} else if ('editSupplier' == item.name) {\n");
      out.write("\t\teditNode();\n");
      out.write("\t} else if ('removeSupplier' == item.name) {\n");
      out.write("\t\tdelNode();\n");
      out.write("\t} else if ('remove' == item.name) {\n");
      out.write("\t\tdelNode();\n");
      out.write("\t} else if ('sort' == item.name) {\n");
      out.write("\t\tsortNode();\n");
      out.write("\t} else if ('edit' == item.name) {\n");
      out.write("\t\teditNode();\n");
      out.write("\t} else if ('fresh' == item.name) {\n");
      out.write("\t\trefreshNode();\n");
      out.write("\t}\n");
      out.write("};\n");
      out.write("function refreshNode() {\n");
      out.write("\tloadTree();\n");
      out.write("};\n");
      out.write("\n");
      out.write("//添加下级公司\n");
      out.write("function addSubCompany() {\n");
      out.write("\tvar selectNode = getSelectNode();\n");
      out.write("\t//if(selectNode.level == 1) {\n");
      out.write("\t//\ttip('不可再添加下级节点');\n");
      out.write("\t//\treturn false;\n");
      out.write("\t//}\n");
      out.write("\tif (!selectNode) \treturn;\n");
      out.write("\tcloseAllTab();\n");
      out.write("\t//var url = \"functionGroupController.do?add&id=\"+selectNode.id;\n");
      out.write("\t//$(\"#listFrame\").attr(\"src\", url);\n");
      out.write("\tvar url = \"organzationController.do?toAddSubCompany&pid=\"+selectNode.id;\n");
      out.write("\taddtt('添加下级公司', url, '01','icon-search', 'false');\n");
      out.write("};\n");
      out.write("\n");
      out.write("//添加下级部门\n");
      out.write("function addSubOrg() {\n");
      out.write("\tvar selectNode = getSelectNode();\n");
      out.write("\t//if(selectNode.level == 1) {\n");
      out.write("\t//\ttip('不可再添加下级节点');\n");
      out.write("\t//\treturn false;\n");
      out.write("\t//}\n");
      out.write("\tif (!selectNode) \treturn;\n");
      out.write("\tcloseAllTab();\n");
      out.write("\t//var url = \"functionGroupController.do?add&id=\"+selectNode.id;\n");
      out.write("\t//$(\"#listFrame\").attr(\"src\", url);\n");
      out.write("\tvar url = \"organzationController.do?toAddSubOrg&pid=\"+selectNode.id;\n");
      out.write("\taddtt('添加下级部门', url, '01','icon-search', 'false');\n");
      out.write("};\n");
      out.write("\n");
      out.write("//添加下级岗位\n");
      out.write("function addSubJob() {\n");
      out.write("\tvar selectNode = getSelectNode();\n");
      out.write("\t//if(selectNode.level == 1) {\n");
      out.write("\t//\ttip('不可再添加下级节点');\n");
      out.write("\t//\treturn false;\n");
      out.write("\t//}\n");
      out.write("\tif (!selectNode) \treturn;\n");
      out.write("\tcloseAllTab();\n");
      out.write("\t//var url = \"functionGroupController.do?add&id=\"+selectNode.id;\n");
      out.write("\t//$(\"#listFrame\").attr(\"src\", url);\n");
      out.write("\tvar url = \"organzationController.do?toAddSubJob&pid=\"+selectNode.id;\n");
      out.write("\taddtt('添加下级岗位', url, '01','icon-search', 'false');\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("function closeAllTab(){\n");
      out.write("\tvar tabs = $('#tt').tabs(\"tabs\");\n");
      out.write("\tvar length = tabs.length;\n");
      out.write("    for(var i=0; i<length; i++){\n");
      out.write("    \tvar onetab = tabs[0];\n");
      out.write("        var title = onetab.panel('options').tab.text();\n");
      out.write("        $(\"#tt\").tabs(\"close\", title);\n");
      out.write("    }\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("//添加一级节点\n");
      out.write("function addOneNode() {\n");
      out.write("\tcloseAllTab();\n");
      out.write("\tvar url = \"organzationController.do?toAddCompany\";\n");
      out.write("\taddtt('添加一级公司', url, '01','icon-search', 'false');\n");
      out.write("};\n");
      out.write("//编辑节点\n");
      out.write("function editNode() {\n");
      out.write("\tvar selectNode = getSelectNode();\n");
      out.write("\tif (!selectNode) \treturn;\n");
      out.write("\t//var url = \"functionGroupController.do?update&id=\"+selectNode.id;\n");
      out.write("\t//$(\"#listFrame\").attr(\"src\", url);\n");
      out.write("\tcloseAllTab();\n");
      out.write("\tvar url = \"organzationController.do?comUpdate&id=\"+selectNode.id;\n");
      out.write("\taddtt('编辑', url, '01','icon-search', 'false');\n");
      out.write("};\n");
      out.write("\n");
      out.write("//删除\n");
      out.write("function delNode() {\n");
      out.write("\tvar selectNode = getSelectNode();\n");
      out.write("\tvar nodeId = selectNode.id;\n");
      out.write("\t//if (nodeId == \"0\") {\n");
      out.write("\t//\ttip('该节点为根节点，不可删除');return;\n");
      out.write("\t//} \n");
      out.write("\tvar url = \"organzationController.do?del&id=\"+selectNode.id;\n");
      out.write("\tif(selectNode.isParent){\n");
      out.write("\t\ttip('存在下级机构，不可删除!');return;\n");
      out.write("\t}\n");
      out.write("\tlayer.confirm('确定删除该机构吗？',{\n");
      out.write("\t\tbtn:['确认','取消']\n");
      out.write("\t},function() {\n");
      out.write("\t\tjQuery.ajax({  \n");
      out.write("\t        async : false,  \n");
      out.write("\t        cache:false,  \n");
      out.write("\t        type: 'GET',  \n");
      out.write("\t        dataType : \"json\",  \n");
      out.write("\t        url: url,//请求的action路径  \n");
      out.write("\t        error: function () {//请求失败处理函数  \n");
      out.write("\t            tip('请求失败');  \n");
      out.write("\t        },  \n");
      out.write("\t        success:function(data){ //请求成功后处理函数。\n");
      out.write("\t\t\t    if(data.success){\n");
      out.write("\t\t\t    \ttip(data.msg);\n");
      out.write("\t\t\t    \torgTree.removeNode(selectNode);\n");
      out.write("\t\t\t    }else{\n");
      out.write("\t\t\t    \ttip(data.msg);\n");
      out.write("\t\t\t    }\n");
      out.write("\t        }  \n");
      out.write("\t    });  \n");
      out.write("\t},function(){\n");
      out.write("\t\treturn;\n");
      out.write("\t});\n");
      out.write("};\n");
      out.write("//选择资源节点。\n");
      out.write("function getSelectNode() {\n");
      out.write("\torgTree = $.fn.zTree.getZTreeObj(\"orgTree\");\n");
      out.write("\tvar nodes = orgTree.getSelectedNodes();\n");
      out.write("\tvar node = nodes[0];\n");
      out.write("\treturn node;\n");
      out.write("};\n");
      out.write("\n");
      out.write("</script>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_t_005fbase_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  t:base
    org.jeecgframework.tag.core.easyui.BaseTag _jspx_th_t_005fbase_005f0 = (org.jeecgframework.tag.core.easyui.BaseTag) _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.get(org.jeecgframework.tag.core.easyui.BaseTag.class);
    _jspx_th_t_005fbase_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fbase_005f0.setParent(null);
    // /webpage/system/organzation/myDepartList.jsp(7,0) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fbase_005f0.setType("jquery,easyui,tools");
    int _jspx_eval_t_005fbase_005f0 = _jspx_th_t_005fbase_005f0.doStartTag();
    if (_jspx_th_t_005fbase_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
    return false;
  }
}
