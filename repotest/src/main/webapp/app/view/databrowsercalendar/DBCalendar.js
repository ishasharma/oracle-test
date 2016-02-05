Ext.define('Repotest.view.databrowsercalendar.DBCalendar', {
	extend : 'Repotest.view.databrowsercalendar.DBCalendarView',
	requires : [ 'Repotest.view.databrowsercalendar.DBCalendarController',
	             'Repotest.view.databrowsercalendar.DBCalendarView','Ext.layout.container.Card',
	             'Ext.calendar.view.Day', 'Ext.calendar.view.Week',
	             'Ext.calendar.view.Month',
	             'Ext.calendar.form.EventDetails',
	             'Ext.calendar.data.EventMappings'],
	controller : 'databrowsercalendar',
	items : [],
	listeners : {
		afterrender : 'loadData',
		scope : "controller"
	}
});
