Ext.define('Repotest.view.reportui.datachart.DataChartTController', {
	extend : 'Ext.app.ViewController',
	alias : 'controller.datacharttController',
	requires : [ 'Repotest.view.reportui.ModifiedProxy' ],
	queryCriteria : null,
	reportView : null,
	reportViewController : null,
	reportQCList : null,
	datagrid : null,
	chartView : null,
	reportJSON : null,
	datapoint : null,
	chartDatas : null,
	mapView : null,
	init : function() {
		this.reportView = this.getView().up();
		this.reportViewController = this.reportView.controller;

		this.getView().add([ {
			title : 'Data',
			itemId : "datapanel",
			autoScroll : true,
			style : 'background:#f6f6f6;',
			layout:'fit',
			items : [this.reportViewController.getDataGrid()]

		}, {
			title : 'Chart',
			layout : "fit",
			width:'100%',
			items : [ {
				xtype : "chart-tabView",
				title:'Analytic',
				itemId : "chart-view",
				reportJSON:this.reportView.reportJSON
			} ]

		},
		{
			title : 'Map',
			layout : "fit",
			items : [ {
				xtype : 'mapPanel',
				bodyStyle : 'background:#D8D8D8'
			} ]

		},{
			title:'QueryCriteria',
			xtype : 'querycriteria'
		}
		]);

	},
	initObjects : function() {
		this.queryCriteria = this.reportView.down("#querycriteria");
		this.datagrid = this.getView().down("#data-grid-view");
		this.chartView = this.getView().down("#chart-view");
		this.chartView.controller.reportView= this.reportView;
		//this.datapoint = this.getView().down("#datapoint");
		this.datapoint=this.reportView.down('#mainDatapoint');
		this.mapView = this.getView().down("#mapPanel");
	},
	refreshData:function(){
		this.filterData(this.datagrid,this);
		
	},
	loadData : function(reportJSON) {
		this.reportJSON = reportJSON;
		this.initObjects();

		// load Query Criteria
		var queryCriteria = this.reportViewController.loadQueryCriteria();

		// load chart data
		this.reportViewController.loadDataPointChart(queryCriteria, this);

		// load Grid Data
		this.reportViewController.loadGridData(queryCriteria, this.datagrid,this);
		// load map data
		this.reportViewController.loadMap(queryCriteria,this);
		
		// set display Query Criteria
		this.setReportDetails();

	},
	filterData : function() {
		this.reportViewController.filterData(this.datagrid, this);
		this.getView().setActiveTab(this.getView().down("#datapanel"));
	},

	setReportDetails : function() {
		this.reportQCList = [];
	},
	tabchange : function(tabPanel, newCard, oldCard, eOpts) {
		/*
		 * resize charts if the active tab is charttab
		 */
		if (newCard.itemId != "datapanel") {
			this.chartView.controller.resizeCharts(this.chartView
					.down("#chartcolumnlayout"));
		}
	},

});