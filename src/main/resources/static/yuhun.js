/*
 * $http请求和jquery的ajax还是有点区别，这里的vue$http.post的data默认不是以form data的形式，而是request payload
 * */
Vue.http.options.emulateJSON = true;

var vue_login = new Vue({
	el : '#yuhun_div',
	data : {
		position:'1',
		yuhunType:'2'
	},
	computed:{
		yuhunTypes:function(){
			var array= [
	            { id: '1', name: '蝠翼' },
	            { id: '2', name: '阴摩罗' }
	          ];
	       return array;
		}
	},
	methods : {
		login : function() {
			console.log("准备登陆: " + this.email + " / " + this.password);
			this.$http.post('/sys/login',{
				name:this.email,
				pwd:this.password
			}).then((response) => {
				// Lambda写法
				// success
				console.log(response.json());
				if(response.json().code=="S0000000"){
					window.location.href="index.html";
				}
			},function(response){
				// 传统写法
				// error
				console.log(response.json().msg);
			});
		}
	}
});