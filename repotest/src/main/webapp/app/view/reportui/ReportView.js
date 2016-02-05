Ext.define('Repotest.view.reportui.ReportView', {
	extend : 'Ext.panel.Panel',
	requires : [ 'Repotest.view.reportui.querycriteria.QueryCriteriaView',
			'Repotest.view.reportui.datachart.DataChartViewTab',
			'Repotest.view.reportui.datachart.DataChartViewPanel',
			'Repotest.view.reportui.ReportViewController' ,
			'Repotest.view.fw.MainDataPointPanel',
			'Repotest.view.googlemaps.map.MapPanel'
			],
	xtype : 'reportview',
	controller : 'reportviewController',
	layout : 'border',
	reportWidgets :["1","2","3","4"],
	//autoScroll : true,
	//margin : '3 0 5 0',
	height:500,
	width:"100%",
	listeners : {
		scope : 'controller',
		afterrender : 'renderReport'
	}
});
