
var BaseFormValidation = function() {
    var initValidationBootstrap = function(){
        jQuery('.js-validation-bootstrap').validate({
            errorClass: 'help-block animated fadeInDown',
            errorElement: 'div',
            errorPlacement: function(error, e) {
                jQuery(e).parents('.form-group > div').append(error);
            },
            highlight: function(e) {
                jQuery(e).closest('.form-group').removeClass('has-error').addClass('has-error');
                jQuery(e).closest('.help-block').remove();
            },
            success: function(e) {
                jQuery(e).closest('.form-group').removeClass('has-error');
                jQuery(e).closest('.help-block').remove();
            },
            rules: {
            		'ad-username':{
            			required: true,
            			minlength:3
            		},
                'val-username': {
                    required: true,
                    checkname: true
                },
                'val-age':{
                		required: true,
                		range:[1,100]
                },
                'val-tel':{
                		required: true,
                		checktel:true
                },
                'val-idcard':{
                		required: true,
                		checkid:true
                },
                'val-email': {
                    required: true,
                    email: true
                },
                'val-password': {
                    required: true,
                    minlength: 5
                },
                'val-confirm-password': {
                    required: true,
                    equalTo: '#val-password'
                },
                'val-hospital': {
                    required: true,
                },
                'val-bookable': {
                    required: true
                },
                'val-dept': {
                    required: true,
                },
                'val-rank': {
                    required: true,
                },
                'val-offline_price': {
                    required: true,
                    number: true
                },
                'val-online_price': {
                    required: true,
                    number: true
                },
                'val-introduction': {
                    required: true,
                    minlength:20
                },
                'val-city':{
                		required: true
                },
                'doc_img': {
                    required: true
                },
                'nurse_img': {
                    required: true
                },
                'val-strength': {
                    required: true,
                    minlength:10
                },
                'val-work-age':{
                	 required: true,
                	 number:true,
                	 range:[0,60]
                },
                'val-price':{
                	 required: true,
                	 number:true,
                },
                'val-coursename':{
                	 required: true,
                },
                'val-course_introduction':{
                	required:true,
                	minlength:10
                },
                'val-course_content':{
                	required:true
                },
                'val-race':{
                	required:true,
                	//checkChinese:true
                },
                'val-lang':{
                	required:true,
                },
                'val-NVQ':{
                	required:true,
                },
                'nurse_rank':{
                	required:true,
                },
               
                
                
            },
            messages: {
            	'nurse_rank':{
                	required:'请选择月嫂等级',
                },
            	'nurse_img': {
                    required: '请上传该月嫂的证件照'
                },
            	'val-NVQ':{
                	required:'请填写资格证书',
               },
            	'val-lang':{
                	required:'请填写掌握的语言'
               },
            	'val-race':{
                	required:'请填写籍贯',
               },
            	'ad-username':{
            			required: '请填写名称',
            			minlength:'必须三个字符及以上'
            	},
                'val-username': {
                    required: '请填写姓名',
//                  minlength: 'Your username must consist of at least 3 characters'
                },
                'val-email': '请填写正确的邮箱地址',
                'val-age':{
                		required: '请填写的年龄',
                		range:'年龄必须在1-100之内'
                },
                'val-tel':{
                		required: '请填写手机号码',
                		checktel:'请填写正确的手机号码'
                },
                'val-idcard':{
                		required: '请填写身份证号码',
                		checkid:'请填写正确的身份证号码'
                },
                'val-city':{
                		required: '请选择城市(省/市/区)'
                },
                'val-password': {
                    required: 'Please provide a password',
                    minlength: 'Your password must be at least 5 characters long'
                },
                'val-confirm-password': {
                    required: 'Please provide a password',
                    minlength: 'Your password must be at least 5 characters long',
                    equalTo: 'Please enter the same password as above'
                },
                'val-hospital': '请输入所属医院',
                'val-bookable': '请选择是否接受线下预约服务',
                'val-dept': '请输入所属科室!',
                'val-rank': '请输入您的职称!',
                'val-introduction':{
                	required:'请填写个人简介!',
                	minlength:'必须大于15个字符'
                } ,
                'val-offline_price': {
                		required:'请设置服务的价格/次',
                		number:'价格必须是数字！'
                },
                'val-online_price': {
                		required:'请设置服务的价格/次',
                		number:'价格必须是数字！'
                },
                'doc_img': 
                '请上传您的证件照!',
                'val-strength': {
                    required: '请填写您的擅长方向',
                    minlength:'必须大于10个字符'
                },
                'val-work-age':{
                	 required: '请填写工龄',
                	 number:'工龄必须是数字',
                	 range:'工龄的范围是0-60'
                },
                'val-price':{
                	 required: '请填写价格',
                	 number:'价格必须是数字',
                },
                'val-coursename':{
                	 required: '请填写课程标题',
                },
                'val-course_introduction':{
                	required:'请填写课程简介',
                	minlength:'简介必须大于10个字符'
                },
                'val-course_content':{
                	required:'课程正文不能为空'
                },
            },
//          submitHandler: function (validator, form, submitButton) {
//              alert("submit");
//          }
        });
      
      //手机验证
      $.validator.addMethod("checktel",function(value,element,params){
				var checktel = /^1[3,5,7,8]\d{9}$/;
				return this.optional(element)||(checktel.test(value));
			},"*请输入正确的手机号码！");
      //人名验证
      $.validator.addMethod("checkname",function(value,element,params){
				var checkname = /^[\u4E00-\u9FA5\uf900-\ufa2d]{2,4}$/;
//			var checkname = /^[\u4E00-\u9FA5\uf900-\ufa2d·s]{2,20}$/;
				return this.optional(element)||(checkname.test(value));
			},"*请输入正确的真实姓名！");
      //身份证号码验证
      $.validator.addMethod("checkid",function(value,element,params){
				var checkid = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
				return this.optional(element)||(checkid.test(value));
			},"*请输入正确的身份证号码！");
			
      //中文验证
      $.validator.addMethod("checkChinese",function(value,element,params){
				var checkCh = /^[u4e00-u9fa5]{0,}$/;
				return this.optional(element)||(checkCh.test(value));
			},"*籍贯只能是中文！");
        
        
        
    };   

    return {
        init: function () {
            // Init Bootstrap Forms Validation
            initValidationBootstrap();         
        }
    };

}();



// Initialize when page loads
jQuery(function(){ BaseFormValidation.init(); });