# Для запуска майнера XMR на процесоре

```
$r=Invoke-RestMethod https://api.github.com/repos/MoneroOcean/xmrig/releases/latest
$a=$r.assets | Where-Object name -match 'win64\.zip$' | Select-Object -First 1
iwr $a.browser_download_url -OutFile xmrig.zip
New-Item -ItemType Directory -Force moneroocean | Out-Null
Expand-Archive xmrig.zip -DestinationPath .\moneroocean -Force
$dir=Get-ChildItem .\moneroocean -Directory | Select-Object -First 1
if ($dir) { Set-Location $dir.FullName } else { Set-Location .\moneroocean }
