Ext.define('Repotest.view.reportui.datachart.DataChartViewTab', {
	extend : 'Ext.tab.Panel',
	requires : [ 'Repotest.view.reportui.datachart.DataChartTController',
	             'Repotest.view.reportui.datachart.datagrid.DataGridView',
	             'Repotest.view.reportui.datachart.chart.ChartTabView',
	             'Repotest.view.reportui.datachart.ChartPointView' ],
	controller : 'datacharttController',
	xtype : 'datachart-tabpanel',
	tabPosition : 'bottom',
	bodyStyle : 'background:#D8D8D8',
	listeners : {
		scope : "controller",
		tabchange : 'tabchange',
		afterrender:function(me){
        	me.setActiveTab(me.items.items[0]);
        }
	}
});