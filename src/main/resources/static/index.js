/*
 * $http请求和jquery的ajax还是有点区别，这里的vue$http.post的data默认不是以form data的形式，而是request payload
 * */
Vue.http.options.emulateJSON = true;

var vue_login = new Vue({
	el : '#login_div',
	data : {
		login_title : '请登录',
		email : '',
		email_placeholder : '请输入邮箱',
		password : '',
		password_placeholder : '请输入密码'
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
				console.log(response.json().code);
			},function(response){
				// 传统写法
				// error
				console.log(response.json().msg);
			});
		}
	}
});