Ext.define('Repotest.view.reportui.datachart.DataChartViewPanel', {
	extend : 'Ext.panel.Panel',
	requires : [ 'Repotest.view.reportui.datachart.DataChartPController',
			'Repotest.view.reportui.datachart.datagrid.DataGridView',
			'Repotest.view.reportui.datachart.chart.ChartTabView',
			'Repotest.view.reportui.datachart.ChartPointView' ],
	controller : 'datachartpController',
	xtype : 'datachart-panel',
	itemId : 'datachart-tabpanel',
	viewType : "panel",
	bodyStyle : 'background:#D8D8D8',

	margin : '0 0 0 0',
	autoScroll : true,
	// layout : 'fit',
	layout : {
		//type : 'accordion',
		type:'vbox',
		padding : 0,
		align : 'stretch',
   		multi : true,
   		titleCollapse: false
	},
	initComponent : function() {
		
		this.callParent(arguments);
	},
	listeners : {
		scope : "controller",
		tabchange : 'tabchange'
	}

});