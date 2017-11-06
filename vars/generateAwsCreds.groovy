def call(mfaArn, totpKey) {
  sh """
    echo 'Generating 2FA code'
    code=`oathtool --totp -b ${totpKey}`

    echo 'Generating token'
    aws sts get-session-token --serial-number ${mfaArn} --token-code $code 
  """
}
