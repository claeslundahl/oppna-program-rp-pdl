<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="clearfix">
    <portlet:actionURL name="establishConsent" var="establishConsentUrl" >
        <portlet:param name="emergency" value="false" />
        <portlet:param name="confirmed" value="true" />
    </portlet:actionURL>

    <portlet:actionURL name="establishConsent" var="establishConsentEmergencyUrl">
         <portlet:param name="emergency" value="true" />
         <portlet:param name="confirmed" value="true" />
    </portlet:actionURL>
    
    <h3 class="legend">${state.patient.patientDisplayName} har ej medgivit sitt samtycke till sammanhållen journalföring</h3>
    
    <div class="clearfix callout callout-info">
    	<p class="label">Du måste intyga patientens samtycke</p>
    	<p>För att få information från andra vårdgivare behöver du inhämta patientens samtycke. Råder en nödsituation kan detta steget passeras. Ditt val loggförs.<p>
    	
    </div>
    
   <a href="${establishConsentUrl}" class="link-button-mod button-simple">Jag har inhämtat patientens samtycke &raquo;</a>
   <a href="${establishConsentEmergencyUrl}" class="link-button-mod button-simple-danger">Nödsituation &raquo;</i></a>
    

</div>
