"use strict";(self.webpackChunkrecepcao_web=self.webpackChunkrecepcao_web||[]).push([[421],{3421:function(e,r,t){t.r(r),t.d(r,{TrocarSenhaModule:function(){return U}});var n=t(8583),o=t(3679),i=t(6627),a=t(1095),s=t(2613),c=t(7441),u=t(7539),l=t(8295),h=t(9983),d=t(7716),m=t(3472),p=t(1739);let f=(()=>{class e{constructor(e,r){this._router=e,this._mensagem=r}resolve(e,r){const t=r.url.split("/"),n=t[t.length-2],o=t[t.length-1];return(!n||!o)&&(this._mensagem.erro("E-mail ou token n\xe3o informados"),this._router.navigate(["recuperar-senha"])),{email:n,token:o}}}return e.\u0275fac=function(r){return new(r||e)(d.LFG(m.F0),d.LFG(p.w))},e.\u0275prov=d.Yz7({token:e,factory:e.\u0275fac,providedIn:"root"}),e})();class g{}var Z=t(2340),v=t(1841);let _=(()=>{class e{constructor(e){this._http=e}trocarSenha(e){return this._http.post(Z.N.AUTHORIZATION_SERVER+"/usuario/trocar-senha",e)}}return e.\u0275fac=function(r){return new(r||e)(d.LFG(v.eN))},e.\u0275prov=d.Yz7({token:e,factory:e.\u0275fac,providedIn:"root"}),e})(),q=(()=>{class e{constructor(e){this._formBuilder=e}criarFormulario(e){e||(e=new g);const r=this._formBuilder.group({email:[e.email,[o.kI.required,o.kI.email]],token:[e.token,[o.kI.required]],senha:[e.senha,[o.kI.required]],senhaRepetir:[e.senhaRepetir,[]]});return r.valueChanges.subscribe(e=>{r.controls.senhaRepetir.setErrors(e.senha!==e.senhaRepetir?{senhaNaoCoincidente:!0}:null)}),r}}return e.\u0275fac=function(r){return new(r||e)(d.LFG(o.qu))},e.\u0275prov=d.Yz7({token:e,factory:e.\u0275fac,providedIn:"root"}),e})();var b=t(1796),A=t(1253);function T(e,r){1&e&&(d.TgZ(0,"div"),d._uU(1," Campo obrigat\xf3rio! "),d.qZA())}function k(e,r){if(1&e&&(d.TgZ(0,"div",18),d.YNc(1,T,2,0,"div",19),d.qZA()),2&e){const e=d.oxw();d.xp6(1),d.Q6J("ngIf",e.frm.controls.senha.errors.required)}}function w(e,r){1&e&&(d.TgZ(0,"div"),d._uU(1," Repeti\xe7\xe3o de senha n\xe3o coincidente! "),d.qZA())}function S(e,r){if(1&e&&(d.TgZ(0,"div",18),d.YNc(1,w,2,0,"div",19),d.qZA()),2&e){const e=d.oxw();d.xp6(1),d.Q6J("ngIf",e.frm.controls.senhaRepetir.errors.senhaNaoCoincidente)}}const x=[{path:"",component:(()=>{class e{constructor(e,r,t,n,o){this._service=e,this._formService=r,this._route=t,this._router=n,this._mensagem=o,this.isEnviado=!1,this.escondeSenha=!0}ngOnInit(){this._route.data.subscribe(e=>{const r=new g;r.email=e[0].email,r.token=e[0].token,this.frm=this._formService.criarFormulario(r)})}ngAfterViewInit(){}enviar(e){if(e.preventDefault(),this.isEnviado=!0,this.frm.invalid){const e="Dados inv\xe1lidos!";throw console.error(this.frm),this._mensagem.erro(e),new Error(e)}this._service.trocarSenha(this.frm.value).subscribe(e=>{this._mensagem.sucesso("Senha alterada com sucesso!"),this._router.navigate(["/","login"])},e=>{const r="Erro ao alterar a senha";console.error(r,e),this._mensagem.erro(r)})}}return e.\u0275fac=function(r){return new(r||e)(d.Y36(_),d.Y36(q),d.Y36(m.gz),d.Y36(m.F0),d.Y36(p.w))},e.\u0275cmp=d.Xpm({type:e,selectors:[["app-trocar-senha"]],decls:43,vars:9,consts:[[1,"container"],[1,"row"],[1,"col-sm-9","col-md-7","col-lg-5","mx-auto"],[1,"card","card-signin","my-5"],[1,"card-body"],["src","assets/img/logo.png",2,"width","60px","height","60px"],[1,"card-title","text-center"],[1,"form-signin",3,"formGroup","ngSubmit"],[1,"form-group"],[1,"form-control"],["appearance","outline",2,"width","100%"],["matInput","","placeholder","Digite nova senha","formControlName","senha","appFrzPoeFoco","",3,"type"],["matSuffix","",3,"click"],["class","text-danger",4,"ngIf"],["matInput","","placeholder","Repita a nova senha","formControlName","senhaRepetir",3,"type"],[1,"my-4"],["type","submit",1,"btn","btn-primary","btn-block"],["type","button","appFrzVoltarBotao","",1,"btn","btn-secondary","btn-block"],[1,"text-danger"],[4,"ngIf"]],template:function(e,r){1&e&&(d.TgZ(0,"div",0),d.TgZ(1,"div",1),d.TgZ(2,"div",2),d.TgZ(3,"div",3),d.TgZ(4,"div",4),d.TgZ(5,"span"),d._UZ(6,"img",5),d.qZA(),d.TgZ(7,"h5",6),d._uU(8,"Trocar Senha"),d.qZA(),d.TgZ(9,"form",7),d.NdJ("ngSubmit",function(e){return r.enviar(e)}),d.TgZ(10,"div",8),d.TgZ(11,"mat-label"),d._uU(12,"E-mail"),d.qZA(),d.TgZ(13,"div",9),d.TgZ(14,"b"),d._uU(15),d.qZA(),d.qZA(),d.qZA(),d.TgZ(16,"div",8),d.TgZ(17,"mat-label"),d._uU(18,"Token"),d.qZA(),d.TgZ(19,"div",9),d.TgZ(20,"b"),d._uU(21),d.qZA(),d.qZA(),d.qZA(),d.TgZ(22,"div",8),d.TgZ(23,"mat-form-field",10),d.TgZ(24,"mat-label"),d._uU(25,"Nova Senha"),d.qZA(),d._UZ(26,"input",11),d.TgZ(27,"mat-icon",12),d.NdJ("click",function(){return r.escondeSenha=!r.escondeSenha}),d._uU(28),d.qZA(),d.qZA(),d.YNc(29,k,2,1,"div",13),d.qZA(),d.TgZ(30,"div",8),d.TgZ(31,"mat-form-field",10),d.TgZ(32,"mat-label"),d._uU(33,"Nova Senha (repetir)"),d.qZA(),d._UZ(34,"input",14),d.TgZ(35,"mat-icon",12),d.NdJ("click",function(){return r.escondeSenha=!r.escondeSenha}),d._uU(36),d.qZA(),d.qZA(),d.YNc(37,S,2,1,"div",13),d.qZA(),d._UZ(38,"hr",15),d.TgZ(39,"button",16),d._uU(40,"Enviar"),d.qZA(),d.TgZ(41,"button",17),d._uU(42,"Voltar"),d.qZA(),d.qZA(),d.qZA(),d.qZA(),d.qZA(),d.qZA(),d.qZA()),2&e&&(d.xp6(9),d.Q6J("formGroup",r.frm),d.xp6(6),d.Oqu(r.frm.value.email),d.xp6(6),d.Oqu(r.frm.value.token),d.xp6(5),d.Q6J("type",r.escondeSenha?"password":"text"),d.xp6(2),d.hij(" ",r.escondeSenha?"visibility_off":"visibility",""),d.xp6(1),d.Q6J("ngIf",r.isEnviado&&r.frm.controls.senha.invalid),d.xp6(5),d.Q6J("type",r.escondeSenha?"password":"text"),d.xp6(2),d.hij(" ",r.escondeSenha?"visibility_off":"visibility",""),d.xp6(1),d.Q6J("ngIf",r.isEnviado&&r.frm.controls.senhaRepetir.invalid))},directives:[o._Y,o.JL,o.sg,l.hX,l.KE,h.Nt,o.Fj,o.JJ,o.u,b.o,i.Hw,l.R9,n.O5,A.C],styles:[""]}),e})(),resolve:[f]}];let y=(()=>{class e{}return e.\u0275fac=function(r){return new(r||e)},e.\u0275mod=d.oAB({type:e}),e.\u0275inj=d.cJS({imports:[[m.Bz.forChild(x)],m.Bz]}),e})();var I=t(5712);let U=(()=>{class e{}return e.\u0275fac=function(r){return new(r||e)},e.\u0275mod=d.oAB({type:e}),e.\u0275inj=d.cJS({providers:[_,q,f],imports:[[n.ez,y,o.UX,i.Ps,h.c,l.lN,u.p9,c.LD,s.Fk,a.ot,I.Y]]}),e})()}}]);