Vue.http.options.emulateJSON = true;

var vue_login = new Vue({
	el : '#index_div',
	data : {
		merchantNo : '1',
		merOrderId : '2',
		merchantName : '',
		log : '',
		status : '',
		tranBus : '',
		email : '',
		tranType : ''
	},
	methods : {
		query_log : function() {
			this.$http.post('/mer/query',{
				merchantNo:this.merchantNo,
				merOrderId:this.merOrderId,
				tranType:this.tranType
			}).then((response) => {
				// Lambda写法
				// success
				res = response.json();
				console.log(res);
				this.log = res.log;
				this.status = res.status;
				this.tranBus = res.tranBus;
				this.email = res.email;
			},function(response){
				// 传统写法
				// error
				console.log(response.json());
			});
		}
	}
});
