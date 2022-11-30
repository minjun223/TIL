function addcheck(){//addcheck부분 버튼을 눌렀을때
	if(frm.resvno.value.length==0){//resvno 부분의 글자가 하나도 안들어간다면 출력
		alert("주문번호가 입력되지 않았습니다.")
		frm.resvno.focus();
		return false;
	}
	else if(frm.name.value.length==0){
		alert("성명이 입력되지 않았습니다!")
		frm.name.focus();
		return false;
	}
	else if(frm.votenum.value.length==0){
		alert("후보번호가 입력되지 않았습니다.")
		frm.votenum.focus();
		return false;
	}
	else if(frm.votetime.value.length==0){
		alert("투표시간이 입력되지 않았습니다.")
		frm.votetime.focus();
		return false;
	}
	else if(frm.votewhere.value.length==0){
		alert("투표장소가 입력되지 않았습니다.")
		frm.votewhere.focus();
		return false;
	}
	else if(frm.rad.value.length==0){
		alert("유권자확인이 선택되지 않았습니다.")
		frm.rad.focus();
		return false;
	}
	else
	alert("투표하기 정보가 정상적으로 등록되었습니다.");
	document.frm.submit();
	return true;
}
function res(){
	alert("정보를 지우고 처음부터 다시합니다.");
	document.frm.reset();
}
